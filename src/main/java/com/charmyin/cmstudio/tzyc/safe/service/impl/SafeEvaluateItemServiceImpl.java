package com.charmyin.cmstudio.tzyc.safe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.persistence.SafeEvaluateItemMapper;
import com.charmyin.cmstudio.tzyc.safe.service.SafeEvaluateItemService;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeDeviceType;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeEvaluateItem;
@Service
public class SafeEvaluateItemServiceImpl implements SafeEvaluateItemService {

	@Resource
	SafeEvaluateItemMapper SafeEvaluateItemMapper ;
	
	
	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return SafeEvaluateItemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SafeEvaluateItem record) {
		// TODO Auto-generated method stub
		return SafeEvaluateItemMapper.insert(record);
	}

	@Override
	public int insertSelective(SafeEvaluateItem record) {
		// TODO Auto-generated method stub
		return SafeEvaluateItemMapper.insertSelective(record);
	}

	@Override
	public SafeEvaluateItem selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return SafeEvaluateItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SafeEvaluateItem record) {
		// TODO Auto-generated method stub
		return SafeEvaluateItemMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SafeEvaluateItem record) {
		// TODO Auto-generated method stub
		return SafeEvaluateItemMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<SafeEvaluateItem> findAllSafeEvaluateItem(
			SafeEvaluateItem record) {
		// TODO Auto-generated method stub
		return SafeEvaluateItemMapper.findAllSafeEvaluateItem(record);
	}

	@Override
	public int logicDeleteByPrimaryKey(String id) {
		SafeEvaluateItem sei = new SafeEvaluateItem();
		sei.setId(id);
		sei.setRecordStatus(1);
		int i = SafeEvaluateItemMapper.updateByPrimaryKeySelective(sei);
		return i;
	}

}
