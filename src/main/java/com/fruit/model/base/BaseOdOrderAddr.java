package com.fruit.model.base;

import com.fruit.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOdOrderAddr<M extends BaseOdOrderAddr<M>> extends BaseModel<M> implements IBean {

	public void setOrderID(String orderID) {
		set("orderID", orderID);
	}

	public String getOrderID() {
		return get("orderID");
	}

	public void setAddr(String addr) {
		set("addr", addr);
	}

	public String getAddr() {
		return get("addr");
	}

}