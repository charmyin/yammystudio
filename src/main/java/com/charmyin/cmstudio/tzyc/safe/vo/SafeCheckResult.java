package com.charmyin.cmstudio.tzyc.safe.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.charmyin.cmstudio.basic.pagination.annotation.Paging;
import com.charmyin.cmstudio.basic.pagination.page.Pagination;
import com.fasterxml.jackson.annotation.JsonFormat;
@Paging(field="pageVO")
public class SafeCheckResult {

	private Pagination pageVO;
    

	public Pagination getPageVO() {
		return pageVO;
	}

	public void setPageVO(Pagination pageVO) {
		this.pageVO = pageVO;
	}


	private String id;
	private String createTime;
	private String deviceName;
	private String inspectName;
	private String taskResult;
	private String filePath;
	private String inspecttime;
	private Integer coId;
	
	private Integer taskStatus;
	
	
	public Integer getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}


	private Integer taskType;
	
	
	public Integer getTaskType() {
		return taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
	}

	public Date getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public Date getTaskEndTime() {
		return taskEndTime;
	}

	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	public Date getTaskCreateTime() {
		return taskCreateTime;
	}

	public void setTaskCreateTime(Date taskCreateTime) {
		this.taskCreateTime = taskCreateTime;
	}


	@JsonFormat(pattern="yyyy-MM-dd",timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd")  
	private Date taskStartTime;
	@JsonFormat(pattern="yyyy-MM-dd",timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd")  
	private Date taskEndTime;
	@JsonFormat(pattern="yyyy-MM-dd",timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private Date taskCreateTime;
	
	private String creatorName;
	
	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}


	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startTime;
	
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endTime;
	
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getCoId() {
		return coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	  @JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Shanghai")  
	    @DateTimeFormat(pattern="yyyy-MM-dd")  
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	  @JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Shanghai")  
	    @DateTimeFormat(pattern="yyyy-MM-dd")  
	public String getInspectName() {
		return inspectName;
	}

	public void setInspectName(String inspectName) {
		this.inspectName = inspectName;
	}

	public String getTaskResult() {
	
		return taskResult;
	}
	public void setTaskResult(String taskResult) {
		
		this.taskResult = taskResult == null ? null : taskResult.trim();
		}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getInspecttime() {
		return inspecttime;
	}

	public void setInspecttime(String inspecttime) {
		this.inspecttime = inspecttime;
	}


}
