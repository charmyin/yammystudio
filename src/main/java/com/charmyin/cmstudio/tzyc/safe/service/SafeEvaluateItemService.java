package com.charmyin.cmstudio.tzyc.safe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.tzyc.safe.vo.SafeEvaluateItem;
@Service
public interface SafeEvaluateItemService {
	  int deleteByPrimaryKey(String id);

	    int insert(SafeEvaluateItem record);

	    int insertSelective(SafeEvaluateItem record);

	    int logicDeleteByPrimaryKey(String id);

	    SafeEvaluateItem selectByPrimaryKey(String id);

	    int updateByPrimaryKeySelective(SafeEvaluateItem record);

	    int updateByPrimaryKey(SafeEvaluateItem record);
	    
	    List<SafeEvaluateItem> findAllSafeEvaluateItem(SafeEvaluateItem record);
}
