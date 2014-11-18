package com.charmyin.cmstudio.tzyc.safe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.persistence.SafeDeviceTypeMapper;
import com.charmyin.cmstudio.tzyc.safe.service.SafeDeviceTypeService;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeDeviceType;

@Service
public class SafeDeviceTypeServiceImpl implements SafeDeviceTypeService {
	
	@Resource
	SafeDeviceTypeMapper safeDeviceTypeMapper;
	
	@Override
	public List<SafeDeviceType> findAllType(SafeDeviceType sdt) {
		List<SafeDeviceType> list = safeDeviceTypeMapper.findAllType(sdt);
		return list;
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		int i = safeDeviceTypeMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int logicDeleteByPrimaryKey(String id) {
		SafeDeviceType sdt = new SafeDeviceType();
		sdt.setId(id);
		sdt.setRecordStatus(1);
		int i = safeDeviceTypeMapper.updateByPrimaryKeySelective(sdt);
		return i;
	}

	@Override
	public int insert(SafeDeviceType record) {
		int i = safeDeviceTypeMapper.insert(record);
		return i;
	}

	@Override
	public int insertSelective(SafeDeviceType record) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public SafeDeviceType selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(SafeDeviceType record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(SafeDeviceType record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
