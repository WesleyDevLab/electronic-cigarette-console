package com.fruit.model.base;

import com.fruit.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSkuOutboundDe<M extends BaseSkuOutboundDe<M>> extends BaseModel<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setOutboundID(String outboundID) {
		set("outboundID", outboundID);
	}

	public String getOutboundID() {
		return get("outboundID");
	}

	public void setSku(String sku) {
		set("sku", sku);
	}

	public String getSku() {
		return get("sku");
	}

	public void setQuantity(Integer quantity) {
		set("quantity", quantity);
	}

	public Integer getQuantity() {
		return get("quantity");
	}

	public void setAllcost(java.math.BigDecimal allcost) {
		set("allcost", allcost);
	}

	public java.math.BigDecimal getAllcost() {
		return get("allcost");
	}

}