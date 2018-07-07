package com.example.demo.entity;

import java.io.Serializable;

/**
 * @ClassName	提案/规范信息表
 * @Description	TODO(这里用一句话描述这个类的作用)
 */
public class ProposalNorm extends PageParameter implements Serializable {

	private static final long serialVersionUID = -3202145228043891863L;

	private Integer SerialNumber; // 编号

	private String EssayName; // 提案名称

	private String NormName; // 规范名称

	private String Content; // 内容

	private Integer SerialNumberOfWriter; // 作者编号

	private String NameOfWriter; // 作者姓名

	private String TimeOfUpdate; // 更新时间

	private String Type; // 类型(1:提案、2:规范)

	private String Status; // 状态(1:已通过、2:征集中、3:未通过)

	public Integer getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		SerialNumber = serialNumber;
	}

	public String getEssayName() {
		return EssayName;
	}

	public void setEssayName(String essayName) {
		EssayName = essayName;
	}

	public String getNormName() {
		return NormName;
	}

	public void setNormName(String normName) {
		NormName = normName;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Integer getSerialNumberOfWriter() {
		return SerialNumberOfWriter;
	}

	public void setSerialNumberOfWriter(Integer serialNumberOfWriter) {
		SerialNumberOfWriter = serialNumberOfWriter;
	}

	public String getNameOfWriter() {
		return NameOfWriter;
	}

	public void setNameOfWriter(String nameOfWriter) {
		NameOfWriter = nameOfWriter;
	}

	public String getTimeOfUpdate() {
		return TimeOfUpdate;
	}

	public void setTimeOfUpdate(String timeOfUpdate) {
		TimeOfUpdate = timeOfUpdate;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}