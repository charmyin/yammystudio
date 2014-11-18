package com.charmyin.cmstudio.tzyc.safe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.persistence.SafeDeviceMapper;
import com.charmyin.cmstudio.tzyc.safe.service.SafeDeviceService;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeDevice;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeDeviceExample;

@Service
public class SafeDeviceServiceImpl implements SafeDeviceService {

	@Resource
	SafeDeviceMapper safeDeviceMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		int count = safeDeviceMapper.deleteByPrimaryKey(id);
		return count;
	}

	@Override
	public List<SafeDevice> findAllDeviceByTypeId(SafeDevice record) {
		List<SafeDevice> list = safeDeviceMapper.findAllDeviceEquals(record);
		return list;
	}

	@Override
	public int insert(SafeDevice record) {
		int affectedRow = safeDeviceMapper.insert(record);
		return affectedRow;
	}

	@Override
	public int insertSelective(SafeDevice record) {
		
		return 0;
	}

	@Override
	public List<SafeDevice> selectByExample(SafeDeviceExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SafeDevice selectByPrimaryKey(String id) {
		SafeDevice sd = safeDeviceMapper.selectByPrimaryKey(id);
		return sd;
	}

	@Override
	public int logicDeleteByPrimaryKey(String id) {
		SafeDevice sd = new SafeDevice();
		sd.setId(id);
		sd.setRecordStatus(1);
		int affectedRow = safeDeviceMapper.updateByPrimaryKey(sd);
		return affectedRow;
	}

	@Override
	public int updateByPrimaryKeySelective(SafeDevice record) {
		int affectedRow = safeDeviceMapper.updateByPrimaryKeySelective(record);
		return affectedRow;
	}

	public SafeDeviceMapper getSafeDeviceMapper() {
		return safeDeviceMapper;
	}

	public void setSafeDeviceMapper(SafeDeviceMapper safeDeviceMapper) {
		this.safeDeviceMapper = safeDeviceMapper;
	}

	@Override
	public int updateByPrimaryKey(SafeDevice record) {
		int affectedRow = safeDeviceMapper.updateByPrimaryKey(record);
		return affectedRow;
	}
	
	
	
	
}
