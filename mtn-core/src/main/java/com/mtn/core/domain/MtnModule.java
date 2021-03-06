package com.mtn.core.domain;

/**
 * @author Prabhakar Manthena
 *
 */
public class MtnModule  implements java.io.Serializable {


     private Integer moduleId;
     private String moduleName;
     private String moduleDesc;
     private String moduleUrl;
     private Integer moduleParent;
     private Integer moduleStatus;
     private Integer moduleOrder;
     private String moduleCrDttm;
     private Integer moduleCrBy;
     private String moduleMdfDttm;
     private Integer moduleMdfBy;     

    public MtnModule() {
    }

	
    public MtnModule(String moduleName, String moduleUrl) {
        this.moduleName = moduleName;
        this.moduleUrl = moduleUrl;
    }
    public MtnModule(String moduleName, String moduleDesc, String moduleUrl, Integer moduleParent, Integer moduleStatus, Integer moduleOrder, String moduleCrDttm, Integer moduleCrBy, String moduleMdfDttm, Integer moduleMdfBy) {
       this.moduleName = moduleName;
       this.moduleDesc = moduleDesc;
       this.moduleUrl = moduleUrl;
       this.moduleParent = moduleParent;
       this.moduleStatus = moduleStatus;
       this.moduleOrder = moduleOrder;
       this.moduleCrDttm = moduleCrDttm;
       this.moduleCrBy = moduleCrBy;
       this.moduleMdfDttm = moduleMdfDttm;
       this.moduleMdfBy = moduleMdfBy;
    }
   
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }
    public String getModuleName() {
        return this.moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getModuleDesc() {
        return this.moduleDesc;
    }
    
    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }
    public String getModuleUrl() {
        return this.moduleUrl;
    }
    
    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }
    public Integer getModuleParent() {
        return this.moduleParent;
    }
    
    public void setModuleParent(Integer moduleParent) {
        this.moduleParent = moduleParent;
    }
    public Integer getModuleStatus() {
        return this.moduleStatus;
    }
    
    public void setModuleStatus(Integer moduleStatus) {
        this.moduleStatus = moduleStatus;
    }
    public Integer getModuleOrder() {
        return this.moduleOrder;
    }
    
    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }
    public String getModuleCrDttm() {
        return this.moduleCrDttm;
    }
    
    public void setModuleCrDttm(String moduleCrDttm) {
        this.moduleCrDttm = moduleCrDttm;
    }
    public Integer getModuleCrBy() {
        return this.moduleCrBy;
    }
    
    public void setModuleCrBy(Integer moduleCrBy) {
        this.moduleCrBy = moduleCrBy;
    }
    public String getModuleMdfDttm() {
        return this.moduleMdfDttm;
    }
    
    public void setModuleMdfDttm(String moduleMdfDttm) {
        this.moduleMdfDttm = moduleMdfDttm;
    }
    public Integer getModuleMdfBy() {
        return this.moduleMdfBy;
    }
    
    public void setModuleMdfBy(Integer moduleMdfBy) {
        this.moduleMdfBy = moduleMdfBy;
    }




}


