package com.charmyin.cmstudio.tzyc.safe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.vo.SafeInspectStandard;
@Service
public interface SafeInspectStandardService {
    int deleteByPrimaryKey(String id);

    int insert(SafeInspectStandard record);

    int insertSelective(SafeInspectStandard record);

    SafeInspectStandard selectByPrimaryKey(String id);

    SafeInspectStandard selectByPrimaryKeyWithTypeItemName(String id);
    
    int updateByPrimaryKeySelective(SafeInspectStandard record);

    int updateByPrimaryKey(SafeInspectStandard record);
    
    List<SafeInspectStandard> findAllSafeInspectStandard(SafeInspectStandard record);
}