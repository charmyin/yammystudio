package com.charmyin.cmstudio.tzyc.safe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.vo.SafeEvaluateType;

@Service
public interface SafeEvaluateTypeService {
	int deleteByPrimaryKey(String id);

    int insertSelective(SafeEvaluateType record);

    SafeEvaluateType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SafeEvaluateType record);
    
    List<SafeEvaluateType> findAllEvaluateType(SafeEvaluateType record);

	int logicDeleteByPrimaryKey(String id); 
 
}
