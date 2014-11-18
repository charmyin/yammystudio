package com.charmyin.cmstudio.tzyc.safe.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.charmyin.cmstudio.basic.pagination.annotation.Paging;
import com.charmyin.cmstudio.basic.pagination.page.Pagination;
import com.fasterxml.jackson.annotation.JsonFormat;
@Paging(field="pageVO")
public class SafeInspectStandard {
	
	private Pagination pageVO;
    

	public Pagination getPageVO() {
		return pageVO;
	}

	public void setPageVO(Pagination pageVO) {
		this.pageVO = pageVO;
	}
	
    private String id;

    private Integer creatorId;

    private Date createTime;

    private String typeId;
    
    private String typeName;

    private String itemId;
    
    private Integer coId;

    public Integer getCoId() {
		return coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	private String itemName;
    
    private String decription;

    private String remark;

    private Long createTimestamp;

    private Integer recordStatus;

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

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription == null ? null : decription.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }
}