package com.tzlh.wedding.biz.model;

import java.util.Date;

public class Picture extends BaseModel {
	private static final long serialVersionUID = -4961874009705797106L;

	// pic类型
	private String type;
	// pic oss链接
	private String link;
	// pic 描述
	private String description;
	// pic 标题
	private String title;
	// pic 副标题
	private String subTitle;
	// 创建时间
	private Date createAt;
	// 更新时间
	private Date updateAt;
	// other json
	private String other;

	public Picture() {
	}

	public Picture(String type, String link, String title, String subTitle,
			String description) {
		this.type = type;
		this.link = link;
		this.title = title;
		this.description = description;
		this.subTitle = subTitle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

}

