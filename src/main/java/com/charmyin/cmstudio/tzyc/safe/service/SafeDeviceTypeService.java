package com.charmyin.cmstudio.tzyc.safe.service;

import java.util.List;

import com.charmyin.cmstudio.tzyc.safe.vo.SafeDeviceType;


public interface SafeDeviceTypeService {
	
	List<SafeDeviceType> findAllType(SafeDeviceType sdt);
	
    int deleteByPrimaryKey(String id);
    
    /**
     * 逻辑删除
     * @param id
     * @return
     */
    int logicDeleteByPrimaryKey(String id);

    int insert(SafeDeviceType record);

    int insertSelective(SafeDeviceType record);


    SafeDeviceType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SafeDeviceType record);

    int updateByPrimaryKey(SafeDeviceType record);
}
