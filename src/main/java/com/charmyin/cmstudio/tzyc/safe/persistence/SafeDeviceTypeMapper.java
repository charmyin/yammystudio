package com.charmyin.cmstudio.tzyc.safe.persistence;

import java.util.List;

import com.charmyin.cmstudio.basic.initial.SQLMapper;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeDeviceType;

@SQLMapper
public interface SafeDeviceTypeMapper {
	
	List<SafeDeviceType> findAllType(SafeDeviceType sdt);
	
    int deleteByPrimaryKey(String id);

    int insert(SafeDeviceType record);

    int insertSelective(SafeDeviceType record);

    SafeDeviceType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SafeDeviceType record);

    int updateByPrimaryKey(SafeDeviceType record);
}