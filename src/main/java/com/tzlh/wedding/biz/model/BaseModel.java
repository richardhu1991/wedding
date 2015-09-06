package com.tzlh.wedding.biz.model;

import java.io.Serializable;

public abstract class BaseModel implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
