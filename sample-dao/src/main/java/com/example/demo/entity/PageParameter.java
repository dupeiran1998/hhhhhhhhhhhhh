package com.example.demo.entity;

/**
 * @ClassName	PageParameter
 * @Description	分页参数
 */
public class PageParameter {

	private Integer offest; // 偏移量

	private Integer limit; // 数据条数

	public Integer getOffest() {
		return offest;
	}

	public void setOffest(Integer offest) {
		this.offest = offest;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}