package com.fruit.controller.mall;

import com.alibaba.druid.util.StringUtils;
import com.fruit.core.auth.anno.RequiresPermissions;
import com.fruit.core.controller.BaseController;
import com.fruit.core.util.JqGridModelUtils;
import com.fruit.core.view.InvokeResult;
import com.fruit.model.mall.CustomerRated;
import com.fruit.model.mall.CustomerRatedDe;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanlei6 on 2016/10/22.
 */
public class CustomerRateController extends BaseController {

    @RequiresPermissions(value = {"/mall/customerRate"})
    public void index() {
        render("customer_rate_index.jsp");
    }

    @RequiresPermissions(value = {"/mall/customerRate"})
    public void view() {
        Long id = getParaToLong("id");
        setAttr("ratedID", id);
        render("customer_rate_view.jsp");
    }

    @RequiresPermissions(value = {"/mall/customerRate"})
    public void getListData() {
        String searchCustomer = this.getPara("search_customer");
        String searchStatus = this.getPara("search_status");
        String select = "select t1.*,t2.cusName,t3.odtime";
        StringBuilder from = new StringBuilder("from customer_rated t1 INNER JOIN mall_customer t2 on t1.customer = t2.cusCode INNER JOIN od_order t3 on t1.orderID = t3.orderID where 1=1");
        List<Object> params = new ArrayList<Object>();
        if (!StringUtils.isEmpty(searchCustomer)) {
            from.append(" and t1.status = ?");
            params.add(searchStatus);
        }
        if (!StringUtils.isEmpty(searchStatus)) {
            from.append(" and t1.customer = ?");
            params.add(searchStatus);
        }
        from.append(" order by t1.id desc");
        Page<CustomerRated> pageInfo = CustomerRated.dao.getPage(getPage(), this.getRows(), select, from.toString(), null, params.toArray());
        this.renderJson(JqGridModelUtils.toJqGridView(pageInfo));
    }

    @RequiresPermissions(value = {"/mall/customerRate"})
    public void getDetailListData() {
        Long ratedID = this.getParaToLong("ratedID");
        String select = "select t1.*,t2.skuName,t3.quantity, t3.price";
        StringBuilder from = new StringBuilder("from customer_rated_de t1 INNER JOIN mall_sku t2 on t1.sku = t2.sku INNER JOIN od_order_de t3 on t1.orderDeID = t3.id where t1.ratedID = ?");
        List<Object> params = new ArrayList<Object>();
        params.add(ratedID);
        Page<CustomerRatedDe> pageInfo = CustomerRatedDe.dao.getPage(getPage(), this.getRows(), select, from.toString(), null, params.toArray());
        this.renderJson(JqGridModelUtils.toJqGridView(pageInfo));
    }

    @RequiresPermissions(value = {"/mall/customerRate"})
    public void audit() {
        String[] ids = getPara("ids").split(",");
        List<CustomerRated> customerRateds = new ArrayList<CustomerRated>();
        for (String id : ids) {
            CustomerRated customerRated = CustomerRated.dao.findById(Long.parseLong(id));
            customerRated.setStatus("1");
            customerRateds.add(customerRated);
        }
        try {
            Db.batchUpdate(customerRateds, ids.length);
        } catch (Exception e) {
            this.renderJson(InvokeResult.failure("操作失败，联系运维"));
        }
        this.renderJson(InvokeResult.success());
    }
}
