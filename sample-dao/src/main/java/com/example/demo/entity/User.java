package com.example.demo.entity;

import java.io.Serializable;

/**
 * @ClassName	User
 * @Description	用户信息表
 */
public class User extends PageParameter implements Serializable {

	private static final long serialVersionUID = 5652374869859990070L;

	private Integer SerialNumber; // 编号

	private String Name; // 姓名

	private String Sex; // 性别

	private String BirthDate; // 出生日期

	private String TelNumber; // 电话号码

	private String IndustryBranch; // 行业分会

	private String SpecialCommittee; // 专委会

	private String SpecialIdentity; // 研究会

	private String NameOfRecommending; // 推荐人

	private String TypeOfRecommending; // 类型(1:入会申请、2:入会推荐)

	private String Content; // 内容

	private String Mail; // 邮箱

	private String Address; // 地址

	private String NameOfWechat; // 微信

	private String Status; // 状态(1:正常、2:待审核、3:拒绝)

	private String Account; // 账户名

	private String Password; // 密码

	private String Type; // 类型(1:管理人员、2:写作人员、3:非会员)

	private String Company; // 单位

	private String Title; // 职称

	private String Job; // 职位

	public Integer getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		SerialNumber = serialNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getTelNumber() {
		return TelNumber;
	}

	public void setTelNumber(String telNumber) {
		TelNumber = telNumber;
	}

	public String getIndustryBranch() {
		return IndustryBranch;
	}

	public void setIndustryBranch(String industryBranch) {
		IndustryBranch = industryBranch;
	}

	public String getSpecialCommittee() {
		return SpecialCommittee;
	}

	public void setSpecialCommittee(String specialCommittee) {
		SpecialCommittee = specialCommittee;
	}

	public String getSpecialIdentity() {
		return SpecialIdentity;
	}

	public void setSpecialIdentity(String specialIdentity) {
		SpecialIdentity = specialIdentity;
	}

	public String getNameOfRecommending() {
		return NameOfRecommending;
	}

	public void setNameOfRecommending(String nameOfRecommending) {
		NameOfRecommending = nameOfRecommending;
	}

	public String getTypeOfRecommending() {
		return TypeOfRecommending;
	}

	public void setTypeOfRecommending(String typeOfRecommending) {
		TypeOfRecommending = typeOfRecommending;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getNameOfWechat() {
		return NameOfWechat;
	}

	public void setNameOfWechat(String nameOfWechat) {
		NameOfWechat = nameOfWechat;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}
	
}