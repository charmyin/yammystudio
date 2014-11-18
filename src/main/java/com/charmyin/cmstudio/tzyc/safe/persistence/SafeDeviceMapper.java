package com.charmyin.cmstudio.tzyc.safe.persistence;

import java.util.List;

import com.charmyin.cmstudio.basic.initial.SQLMapper;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeDevice;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeDeviceExample;

@SQLMapper
public interface SafeDeviceMapper {
    int deleteByPrimaryKey(String id);

    int insert(SafeDevice record);

    int insertSelective(SafeDevice record);

    List<SafeDevice> selectByExample(SafeDeviceExample example);

    SafeDevice selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SafeDevice record);

    int updateByPrimaryKey(SafeDevice record);
    
    List<SafeDevice> findAllDeviceEquals(SafeDevice record);
}