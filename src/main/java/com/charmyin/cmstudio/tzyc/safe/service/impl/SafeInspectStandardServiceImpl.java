package com.charmyin.cmstudio.tzyc.safe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.persistence.SafeInspectStandardMapper;
import com.charmyin.cmstudio.tzyc.safe.service.SafeInspectStandardService;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeInspectStandard;
@Service
public class SafeInspectStandardServiceImpl implements
		SafeInspectStandardService {

	@Resource
	SafeInspectStandardMapper SafeInspectStandardMapper;
	
	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return SafeInspectStandardMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SafeInspectStandard record) {
		// TODO Auto-generated method stub
		return SafeInspectStandardMapper.insert(record);
	}

	@Override
	public int insertSelective(SafeInspectStandard record) {
		// TODO Auto-generated method stub
		return SafeInspectStandardMapper.insertSelective(record);
	}

	@Override
	public SafeInspectStandard selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return SafeInspectStandardMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SafeInspectStandard record) {
		// TODO Auto-generated method stub
		return SafeInspectStandardMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SafeInspectStandard record) {
		// TODO Auto-generated method stub
		return SafeInspectStandardMapper.updateByPrimaryKey(record);
	}

	@Override
	public SafeInspectStandard selectByPrimaryKeyWithTypeItemName(String id) {
		// TODO Auto-generated method stub
		return SafeInspectStandardMapper.selectByPrimaryKeyWithTypeItemName(id);
	}

	@Override
	public List<SafeInspectStandard> findAllSafeInspectStandard(
			SafeInspectStandard record) {
		// TODO Auto-generated method stub
		return SafeInspectStandardMapper.findAllSafeInspectStandard(record);
	}

}
