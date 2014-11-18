package com.charmyin.cmstudio.tzyc.safe.persistence;

import java.util.List;

import com.charmyin.cmstudio.basic.initial.SQLMapper;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeInspectStandard;
@SQLMapper
public interface SafeInspectStandardMapper {
    int deleteByPrimaryKey(String id);

    int insert(SafeInspectStandard record);

    int insertSelective(SafeInspectStandard record);

    SafeInspectStandard selectByPrimaryKey(String id);
 
    SafeInspectStandard selectByPrimaryKeyWithTypeItemName(String id);

    int updateByPrimaryKeySelective(SafeInspectStandard record);

    int updateByPrimaryKey(SafeInspectStandard record);
    
    List<SafeInspectStandard> findAllSafeInspectStandard(SafeInspectStandard record);
}