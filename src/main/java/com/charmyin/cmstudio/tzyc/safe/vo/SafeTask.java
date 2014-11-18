package com.charmyin.cmstudio.tzyc.safe.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.charmyin.cmstudio.basic.pagination.annotation.Paging;
import com.charmyin.cmstudio.basic.pagination.page.Pagination;
import com.fasterxml.jackson.annotation.JsonFormat;

@Paging(field="pageVO")
public class SafeTask {
	
	private Pagination pageVO;
	
    private String id;
   
    private String creatorUi;
    
    private Integer creatorId;
    
    private String inspectName;
    
    private String creatorName;
    
    private String equipStatus;
    
    private String departName;
    
    private String taskResult;
    
    private String taskStatus;
    
    

    public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskResult() {
		return taskResult;
	}

	public void setTaskResult(String taskResult) {
		this.taskResult = taskResult;
	}

	public String getInspectName() {
		return inspectName;
	}

	public void setInspectName(String inspectName) {
		this.inspectName = inspectName;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getEquipStatus() {
		return equipStatus;
	}

	public void setEquipStatus(String equipStatus) {
		this.equipStatus = equipStatus;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getInspectorId() {
		return inspectorId;
	}

	public void setInspectorId(Integer inspectorId) {
		this.inspectorId = inspectorId;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    private Date createTime;

    private Integer taskType;

    
    private String deviceId;
    
    private String deviceName;
    
    public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	private String detailId;
    
    private Integer coId;
    

    public Integer getCoId() {
		return coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
    private Date startTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
    private Date endTime;
    
    private String position;

	private String name;

	private String code;

	private String typeName;
	    
	private Integer inspectorId;

    private Integer recordStatus;
    public String getCreatorUi() {
		return creatorUi;
	}
    
    

	public void setCreatorUi(String creatorUi) {
		this.creatorUi = creatorUi;
	}

    
    public Pagination getPageVO() {
   		return pageVO;
   	}

   	public void setPageVO(Pagination pageVO) {
   		this.pageVO = pageVO;
   	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

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

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }
}