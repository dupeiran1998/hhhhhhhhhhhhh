package com.example.demo.entity;

import java.io.Serializable;

/**
 * @ClassName	Opinion
 * @Description	附议信息表
 */
public class Opinion extends PageParameter implements Serializable {

	private static final long serialVersionUID = -8227603861532233508L;

	private Integer SerialNumber; // 编号

	private Integer ProposalOfSerialNumber; // 提案编号

	private Integer UserOfSerialNumber; // 用户编号

	private String UserOfName; // 用户姓名

	private String Content; // 内容

	private String Position; // 立场(1:附议、2:反对)

	public Integer getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		SerialNumber = serialNumber;
	}

	public Integer getProposalOfSerialNumber() {
		return ProposalOfSerialNumber;
	}

	public void setProposalOfSerialNumber(Integer proposalOfSerialNumber) {
		ProposalOfSerialNumber = proposalOfSerialNumber;
	}

	public Integer getUserOfSerialNumber() {
		return UserOfSerialNumber;
	}

	public void setUserOfSerialNumber(Integer userOfSerialNumber) {
		UserOfSerialNumber = userOfSerialNumber;
	}

	public String getUserOfName() {
		return UserOfName;
	}

	public void setUserOfName(String userOfName) {
		UserOfName = userOfName;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

}