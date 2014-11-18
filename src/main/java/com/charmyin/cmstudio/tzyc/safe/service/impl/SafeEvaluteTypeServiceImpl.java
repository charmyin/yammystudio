package com.charmyin.cmstudio.tzyc.safe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.persistence.SafeEvaluateTypeMapper;
import com.charmyin.cmstudio.tzyc.safe.service.SafeEvaluateTypeService;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeEvaluateType;

@Service
public class SafeEvaluteTypeServiceImpl implements SafeEvaluateTypeService {

	@Resource
	SafeEvaluateTypeMapper safeEvaluateTypeMapper;
	
	@Override
	public int deleteByPrimaryKey(String id) {
		int count = safeEvaluateTypeMapper.deleteByPrimaryKey(id);
		return count;
	}

	@Override
	public int insertSelective(SafeEvaluateType record) {
		int i = safeEvaluateTypeMapper.insert(record);
		record.setCreateTimestamp(System.currentTimeMillis());
		return i;
	}

	@Override
	public SafeEvaluateType selectByPrimaryKey(String id) {
		SafeEvaluateType safeEvaluateType =safeEvaluateTypeMapper.selectByPrimaryKey(id);
		return safeEvaluateType;
	}

	@Override
	public int updateByPrimaryKeySelective(SafeEvaluateType record) {
		int i = safeEvaluateTypeMapper.updateByPrimaryKey(record);
		return i;
	}

	@Override
	public List<SafeEvaluateType> findAllEvaluateType(SafeEvaluateType record) {
		List<SafeEvaluateType> list = safeEvaluateTypeMapper.findAllEvaluateEquals(record);
		return list;
	}

	@Override
	public int logicDeleteByPrimaryKey(String id) {
		SafeEvaluateType safeEvaluateType = new SafeEvaluateType();
		safeEvaluateType.setId(id);
		safeEvaluateType.setRecordStatus(1);
		int i = safeEvaluateTypeMapper.updateByPrimaryKeySelective(safeEvaluateType);
		return i;
	}
	
}
