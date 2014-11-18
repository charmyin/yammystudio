package com.charmyin.cmstudio.tzyc.safe.persistence;

import java.util.List;

import com.charmyin.cmstudio.basic.initial.SQLMapper;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeEvaluateType;

@SQLMapper
public interface SafeEvaluateTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(SafeEvaluateType record);

    int insertSelective(SafeEvaluateType record);

    SafeEvaluateType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SafeEvaluateType record);

    int updateByPrimaryKey(SafeEvaluateType record);
    
    List<SafeEvaluateType> findAllEvaluateEquals(SafeEvaluateType record);
}