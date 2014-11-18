package com.charmyin.cmstudio.tzyc.safe.service;

import java.util.List;

import com.charmyin.cmstudio.tzyc.safe.vo.SafeDevice;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeDeviceExample;


public interface SafeDeviceService {
	
	int deleteByPrimaryKey(String id);

    int insert(SafeDevice record);

    int insertSelective(SafeDevice record);

    List<SafeDevice> selectByExample(SafeDeviceExample example);

    SafeDevice selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SafeDevice record);

    int updateByPrimaryKey(SafeDevice record);
    
    int logicDeleteByPrimaryKey(String id);
    
    List<SafeDevice> findAllDeviceByTypeId(SafeDevice record);
}
