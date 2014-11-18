package com.charmyin.cmstudio.tzyc.safe.persistence;

import com.charmyin.cmstudio.basic.initial.SQLMapper;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeEvaluateItem;

import java.util.List;

import org.springframework.stereotype.Service;
@SQLMapper
public interface SafeEvaluateItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(SafeEvaluateItem record);


    int insertSelective(SafeEvaluateItem record);
    
    List<SafeEvaluateItem> findAllSafeEvaluateItem(SafeEvaluateItem record);

    SafeEvaluateItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SafeEvaluateItem record);

    int delete(SafeEvaluateItem record);
    int updateByPrimaryKey(SafeEvaluateItem record);
	int logicDeleteByPrimaryKey(String id);
}