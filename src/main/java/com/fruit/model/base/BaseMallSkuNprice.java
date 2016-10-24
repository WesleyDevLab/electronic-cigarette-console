package com.fruit.model.base;

import com.fruit.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMallSkuNprice<M extends BaseMallSkuNprice<M>> extends BaseModel<M> implements IBean {

	public void setSku(String sku) {
		set("sku", sku);
	}

	public String getSku() {
		return get("sku");
	}

	public void setPriceType(String priceType) {
		set("priceType", priceType);
	}

	public String getPriceType() {
		return get("priceType");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}

	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setOffStat(Integer offStat) {
		set("offStat", offStat);
	}

	public Integer getOffStat() {
		return get("offStat");
	}

	public void setNum1(Integer num1) {
		set("num1", num1);
	}

	public Integer getNum1() {
		return get("num1");
	}

	public void setPrice1(java.math.BigDecimal price1) {
		set("price1", price1);
	}

	public java.math.BigDecimal getPrice1() {
		return get("price1");
	}

	public void setNum2(Integer num2) {
		set("num2", num2);
	}

	public Integer getNum2() {
		return get("num2");
	}

	public void setPrice2(java.math.BigDecimal price2) {
		set("price2", price2);
	}

	public java.math.BigDecimal getPrice2() {
		return get("price2");
	}

	public void setNum3(Integer num3) {
		set("num3", num3);
	}

	public Integer getNum3() {
		return get("num3");
	}

	public void setPrice3(java.math.BigDecimal price3) {
		set("price3", price3);
	}

	public java.math.BigDecimal getPrice3() {
		return get("price3");
	}

}