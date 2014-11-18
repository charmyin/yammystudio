package com.charmyin.cmstudio.tzyc.safe.vo;

import com.charmyin.cmstudio.basic.pagination.annotation.Paging;
import com.charmyin.cmstudio.basic.pagination.page.Pagination;


@Paging(field="pageVO")
public class SafeDeviceType {
    private String id;

    private String code;
    private Integer coId;
    public Integer getCoId() {
		return coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	private String name;

    private Integer recordStatus;
    
    private Pagination pageVO;
    

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }
}