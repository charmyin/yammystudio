package com.charmyin.cmstudio.tzyc.safe.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.charmyin.cmstudio.basic.authorize.vo.User;
import com.charmyin.cmstudio.basic.pagination.page.Pagination;
import com.charmyin.cmstudio.basic.pagination.page.PaginationResultVO;
import com.charmyin.cmstudio.common.utils.UUIDGenerator;
import com.charmyin.cmstudio.tzyc.safe.service.SafeEvaluateItemService;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeEvaluateItem;
import com.charmyin.cmstudio.web.utils.ResponseUtil;
import com.charmyin.cmstudio.web.utils.UserSessionUtil;

@Controller
@RequestMapping("/safe/evaluate/item")
public class SafeEvaluateItemController {
 
	
	@Resource
	SafeEvaluateItemService safeEvaluateItemService;
	
	@RequestMapping("/index")
	public String evaluateItem(){
		return "tzyc/safe/evaluate/item";
	}

	
	/**
	 * 查询所有对象
	 * @param page
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/all")
	@ResponseBody
	@Transactional
	public PaginationResultVO findAllDevices(Pagination page, String typeId){
		page.setPage(0);
		page.setRows(99999);
		SafeEvaluateItem sei = new SafeEvaluateItem();
		sei.setTypeId(typeId);
		sei.setPageVO(page);
		User userInfo = UserSessionUtil.getUserInSession();
		
		List<SafeEvaluateItem> list = safeEvaluateItemService.findAllSafeEvaluateItem(sei);
		PaginationResultVO prv = new PaginationResultVO();
		prv.setTotal(String.valueOf(sei.getPageVO().getTotalRows()));
		prv.setRows(list);
		return prv;
	}
	
	/**
	 * 查询所有对象,无格式
	 * @param page
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/allWithoutPagerInfo")
	@ResponseBody
	@Transactional
	public List<SafeEvaluateItem> findAllDevicesWithoutPagerInfo(Pagination page, String typeId){
		page.setPage(0);
		page.setRows(99999);
		SafeEvaluateItem sei = new SafeEvaluateItem();
		sei.setTypeId(typeId);
		sei.setPageVO(page);
		User userInfo = UserSessionUtil.getUserInSession();
		List<SafeEvaluateItem> list = safeEvaluateItemService.findAllSafeEvaluateItem(sei);
 
		return list;
	}
	
	/**
	 * 保存对象
	 * @param SafeDevice
	 * @return
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String addDevice(SafeEvaluateItem sei){
		
		try{
			//生成主键：UUID
			String uuid = UUIDGenerator.generate();
			sei.setId(uuid);
			//生成日期
			sei.setCreateTimestamp(System.currentTimeMillis());
			sei.setRecordStatus(0);
			//COID
			User userInfo = UserSessionUtil.getUserInSession();
			
		
			//插入数据库
			safeEvaluateItemService.insertSelective(sei);
			return ResponseUtil.getSuccessResultString();
		}catch(Exception e){
			e.printStackTrace();
			return ResponseUtil.getFailResultString("保存过程中出错！");
		}

	}
	/**
	 * 更新对象
	 * @param SafeDevice
	 * @return
	 */
	@RequestMapping(value="/update", method=RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String updateDevice(SafeEvaluateItem sei){
		try{
			User userInfo = UserSessionUtil.getUserInSession();
			sei.setCreateTimestamp(System.currentTimeMillis());
			
			safeEvaluateItemService.updateByPrimaryKeySelective(sei);
		}catch(Exception e){
			return ResponseUtil.getFailResultString("保存过程中出错！");
		}	
		return ResponseUtil.getSuccessResultString();	
	}

	/**
	 * 按找ID逻辑删除，上传参数为：12,33,12,33
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/deleteByIds", method=RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	@ResponseBody
	@Transactional
	public String delete(String ids){
		
		String[] idArray = ids.split(",");
		if(idArray.length>0){
			try{
				for(String id : idArray){
					User userInfo = UserSessionUtil.getUserInSession();
				
					safeEvaluateItemService.logicDeleteByPrimaryKey(id);
				}
			}catch(Exception e){
				return ResponseUtil.getFailResultString("保存过程中出错！");
			}			
		}
		
		return ResponseUtil.getSuccessResultString();	
	}
	
}
