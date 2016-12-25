package com.fruit.model.base;

import com.fruit.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOdOrder<M extends BaseOdOrder<M>> extends BaseModel<M> implements IBean {

    public void setOrderID(String orderID) {
        set("orderID", orderID);
    }

    public String getOrderID() {
        return get("orderID");
    }

    public void setCustomer(String customer) {
        set("customer", customer);
    }

    public String getCustomer() {
        return get("customer");
    }

    public void setReviewer(String reviewer) {
        set("reviewer", reviewer);
    }

    public String getReviewer() {
        return get("reviewer");
    }

    public void setAddrID(Integer addrID) {
        set("addrID", addrID);
    }

    public Integer getAddrID() {
        return get("addrID");
    }

    public void setAmount(java.math.BigDecimal amount) {
        set("amount", amount);
    }

    public java.math.BigDecimal getAmount() {
        return get("amount");
    }

    public void setCourierNum(String courierNum) {
        set("courierNum", courierNum);
    }

    public String getCourierNum() {
        return get("courierNum");
    }

    public void setStatus(Integer status) {
        set("status", status);
    }

    public Integer getStatus() {
        return get("status");
    }

    public void setOdtime(java.util.Date odtime) {
        set("odtime", odtime);
    }

    public java.util.Date getOdtime() {
        return get("odtime");
    }

    public void setExpress(String express) {
        set("express", express);
    }

    public String getExpress() {
        return get("express");
    }

    public void setCertificate(String certificate) {
        set("certificate", certificate);
    }

    public String getCertificate() {
        return get("certificate");
    }

    public void setCusName(String cusName) {
        set("cusName", cusName);
    }

    public String getCusName() {
        return get("cusName");
    }

    public void setAddr(String addr) {
        set("addr", addr);
    }

    public String getAddr() {
        return get("addr");
    }
}