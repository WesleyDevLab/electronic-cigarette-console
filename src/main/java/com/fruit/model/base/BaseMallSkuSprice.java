package com.fruit.model.base;

import com.fruit.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMallSkuSprice<M extends BaseMallSkuSprice<M>> extends BaseModel<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setSku(String sku) {
		set("sku", sku);
	}

	public String getSku() {
		return get("sku");
	}

	public void setCustomer(String customer) {
		set("customer", customer);
	}

	public String getCustomer() {
		return get("customer");
	}

	public void setFristbuy(Integer fristbuy) {
		set("fristbuy", fristbuy);
	}

	public Integer getFristbuy() {
		return get("fristbuy");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}

	public java.math.BigDecimal getPrice() {
		return get("price");
	}

}
