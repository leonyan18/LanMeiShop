package org.lanmei.admin.dao.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_admin_login
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CmsAdminLogin {

	/**
	 * Database Column Remarks: 登录日志ID This field was generated by MyBatis Generator. This field corresponds to the database column cms_admin_login.login_id
	 * @mbg.generated
	 */
	private Integer loginId;
	/**
	 * Database Column Remarks: 登录时间 This field was generated by MyBatis Generator. This field corresponds to the database column cms_admin_login.login_time
	 * @mbg.generated
	 */
	private Date loginTime;
	/**
	 * Database Column Remarks: 登录IP This field was generated by MyBatis Generator. This field corresponds to the database column cms_admin_login.login_ip
	 * @mbg.generated
	 */
	private String loginIp;
	/**
	 * Database Column Remarks: 用户id This field was generated by MyBatis Generator. This field corresponds to the database column cms_admin_login.admin_id
	 * @mbg.generated
	 */
	private Integer adminId;
	/**
	 * Database Column Remarks: 浏览器 This field was generated by MyBatis Generator. This field corresponds to the database column cms_admin_login.explorer
	 * @mbg.generated
	 */
	private String explorer;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_admin_login.login_id
	 * @return  the value of cms_admin_login.login_id
	 * @mbg.generated
	 */
	public Integer getLoginId() {
		return loginId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_admin_login.login_id
	 * @param loginId  the value for cms_admin_login.login_id
	 * @mbg.generated
	 */
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_admin_login.login_time
	 * @return  the value of cms_admin_login.login_time
	 * @mbg.generated
	 */
	public Date getLoginTime() {
		return loginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_admin_login.login_time
	 * @param loginTime  the value for cms_admin_login.login_time
	 * @mbg.generated
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_admin_login.login_ip
	 * @return  the value of cms_admin_login.login_ip
	 * @mbg.generated
	 */
	public String getLoginIp() {
		return loginIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_admin_login.login_ip
	 * @param loginIp  the value for cms_admin_login.login_ip
	 * @mbg.generated
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_admin_login.admin_id
	 * @return  the value of cms_admin_login.admin_id
	 * @mbg.generated
	 */
	public Integer getAdminId() {
		return adminId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_admin_login.admin_id
	 * @param adminId  the value for cms_admin_login.admin_id
	 * @mbg.generated
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cms_admin_login.explorer
	 * @return  the value of cms_admin_login.explorer
	 * @mbg.generated
	 */
	public String getExplorer() {
		return explorer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cms_admin_login.explorer
	 * @param explorer  the value for cms_admin_login.explorer
	 * @mbg.generated
	 */
	public void setExplorer(String explorer) {
		this.explorer = explorer;
	}
}