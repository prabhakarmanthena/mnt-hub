package com.mtn.core.domain;

/**
 * @author Prabhakar Manthena
 *
 */
public class MtnModuleRole implements java.io.Serializable {

	private Integer mrId;
	private int mrModule;
	private int mrRole;
	private Integer mrView;
	private Integer mrEdit;
	private Integer mrStatus;
	private String mrCrDttm;
	private Integer mrCrBy;
	private String mrMdfDttm;
	private Integer mrMdfBy;

	public MtnModuleRole() {
	}

	public MtnModuleRole(int mrModule, int mrRole) {
		this.mrModule = mrModule;
		this.mrRole = mrRole;
	}

	public MtnModuleRole(int mrModule, int mrRole, Integer mrView, Integer mrEdit,
			Integer mrStatus, String mrCrDttm, Integer mrCrBy,
			String mrMdfDttm, Integer mrMdfBy) {
		this.mrModule = mrModule;
		this.mrRole = mrRole;
		this.mrView = mrView;
		this.mrEdit = mrEdit;
		this.mrStatus = mrStatus;
		this.mrCrDttm = mrCrDttm;
		this.mrCrBy = mrCrBy;
		this.mrMdfDttm = mrMdfDttm;
		this.mrMdfBy = mrMdfBy;
	}

	public Integer getMrId() {
		return this.mrId;
	}

	public void setMrId(Integer mrId) {
		this.mrId = mrId;
	}

	public int getMrModule() {
		return this.mrModule;
	}

	public void setMrModule(int mrModule) {
		this.mrModule = mrModule;
	}

	public int getMrRole() {
		return this.mrRole;
	}

	public void setMrRole(int mrRole) {
		this.mrRole = mrRole;
	}

	public Integer getMrView() {
		return this.mrView;
	}

	public void setMrView(Integer mrView) {
		this.mrView = mrView;
	}

	public Integer getMrEdit() {
		return this.mrEdit;
	}

	public void setMrEdit(Integer mrEdit) {
		this.mrEdit = mrEdit;
	}

	public Integer getMrStatus() {
		return this.mrStatus;
	}

	public void setMrStatus(Integer mrStatus) {
		this.mrStatus = mrStatus;
	}

	public String getMrCrDttm() {
		return this.mrCrDttm;
	}

	public void setMrCrDttm(String mrCrDttm) {
		this.mrCrDttm = mrCrDttm;
	}

	public Integer getMrCrBy() {
		return this.mrCrBy;
	}

	public void setMrCrBy(Integer mrCrBy) {
		this.mrCrBy = mrCrBy;
	}

	public String getMrMdfDttm() {
		return this.mrMdfDttm;
	}

	public void setMrMdfDttm(String mrMdfDttm) {
		this.mrMdfDttm = mrMdfDttm;
	}

	public Integer getMrMdfBy() {
		return this.mrMdfBy;
	}

	public void setMrMdfBy(Integer mrMdfBy) {
		this.mrMdfBy = mrMdfBy;
	}

}
