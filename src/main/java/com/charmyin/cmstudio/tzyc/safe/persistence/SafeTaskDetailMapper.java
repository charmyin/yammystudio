package com.charmyin.cmstudio.tzyc.safe.persistence;

import com.charmyin.cmstudio.basic.initial.SQLMapper;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeTaskDetail;

@SQLMapper
public interface SafeTaskDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(SafeTaskDetail record);

    int insertSelective(SafeTaskDetail record);

    SafeTaskDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SafeTaskDetail record);

    int updateByPrimaryKey(SafeTaskDetail record);
    
    int deleteInstantTaskByTaskId(String taskId);
    
    SafeTaskDetail selectByPrimaryKeyByTaskId(String taskId);
    
}