package com.charmyin.cmstudio.tzyc.safe.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.charmyin.cmstudio.basic.pagination.annotation.Paging;
import com.charmyin.cmstudio.basic.pagination.page.Pagination;
import com.fasterxml.jackson.annotation.JsonFormat;


@Paging(field="pageVO")
public class SafeDevice {

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

    private String code;

    private String typeId;

    private String name;

    private String departId;

    private String brand;

    private String model;

    private String position;

    private String application;

    @JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd")  
    private Date openingDate;

    private Integer equipStatus;

    @JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd")  
    private Date productionDate;

    private Integer amount;

    private String productionBatch;

    private String registrationCode;

    private String financialCode;

    private String manufacturer;

    private String remark;

    private String plateNumber;

    private String vehicleType;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")  
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
    private Date initialRegisteTime;

    private String engineCode;

    private String frameCode;

    private String vehicleBookCode;

    private String annualInspection;

    private String driver;

    private Long createTimestamp;

    private Integer recordStatus;
    
    private String creatorName;
    
    private Integer coId;
    

	public Integer getCoId() {
		return coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Integer getEquipStatus() {
        return equipStatus;
    }

    public void setEquipStatus(Integer equipStatus) {
        this.equipStatus = equipStatus;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getProductionBatch() {
        return productionBatch;
    }

    public void setProductionBatch(String productionBatch) {
        this.productionBatch = productionBatch == null ? null : productionBatch.trim();
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode == null ? null : registrationCode.trim();
    }

    public String getFinancialCode() {
        return financialCode;
    }

    public void setFinancialCode(String financialCode) {
        this.financialCode = financialCode == null ? null : financialCode.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType == null ? null : vehicleType.trim();
    }

    public Date getInitialRegisteTime() {
        return initialRegisteTime;
    }

    public void setInitialRegisteTime(Date initialRegisteTime) {
        this.initialRegisteTime = initialRegisteTime;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode == null ? null : engineCode.trim();
    }

    public String getFrameCode() {
        return frameCode;
    }

    public void setFrameCode(String frameCode) {
        this.frameCode = frameCode == null ? null : frameCode.trim();
    }

    public String getVehicleBookCode() {
        return vehicleBookCode;
    }

    public void setVehicleBookCode(String vehicleBookCode) {
        this.vehicleBookCode = vehicleBookCode == null ? null : vehicleBookCode.trim();
    }

    public String getAnnualInspection() {
        return annualInspection;
    }

    public void setAnnualInspection(String annualInspection) {
        this.annualInspection = annualInspection == null ? null : annualInspection.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
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