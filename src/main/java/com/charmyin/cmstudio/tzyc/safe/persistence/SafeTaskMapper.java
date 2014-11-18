package com.charmyin.cmstudio.tzyc.safe.persistence;

import java.util.List;
import java.util.Map;

import com.charmyin.cmstudio.basic.initial.SQLMapper;
import com.charmyin.cmstudio.tzyc.safe.vo.SafeTask;

@SQLMapper
public interface SafeTaskMapper {
	int deleteByPrimaryKey(String id);

	int insert(SafeTask record);

	int insertSelective(SafeTask record);

	SafeTask selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(SafeTask record);

	int updateByPrimaryKey(SafeTask record);

	List<SafeTask> findAllSafeTaskEquals(SafeTask safeTask);
	List<SafeTask> getlist_TaskSchedule_ForExport(Map<String, String> map);
	 List<SafeTask> getListSafeTasks();


}