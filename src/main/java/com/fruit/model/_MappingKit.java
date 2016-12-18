package com.fruit.model;

import com.fruit.model.mall.*;
import com.fruit.model.stock.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

    public static void mapping(ActiveRecordPlugin arp) {
        arp.addMapping("access_token", "uid", AccessToken.class);
        arp.addMapping("app_version", "id", AppVersion.class);
        arp.addMapping("dict_data", "id", DictData.class);
        arp.addMapping("dict_type", "id", DictType.class);
        arp.addMapping("sys_log", "id", SysLog.class);
        arp.addMapping("sys_login_record", "id", SysLoginRecord.class);
        arp.addMapping("sys_res", "id", SysRes.class);
        arp.addMapping("sys_role", "id", SysRole.class);
        arp.addMapping("sys_role_res", "id", SysRoleRes.class);
        arp.addMapping("sys_user", "id", SysUser.class);
        arp.addMapping("sys_user_role", "id", SysUserRole.class);
        arp.addMapping("mall_category", "id", Category.class);
        arp.addMapping("mall_sku", "id", Sku.class);
        arp.addMapping("console_sequence", "id", ConsoleSequence.class);
        arp.addMapping("mall_customer", "id", Customer.class);
        arp.addMapping("mall_customer_addr", "id", CustomerAddr.class);
        arp.addMapping("mall_customer_shop", "id", CustomerShop.class);
        arp.addMapping("mall_sku_nprice", "id", SkuNprice.class);
        arp.addMapping("mall_sku_sprice", "id", SkuSprice.class);
        arp.addMapping("sku_inbound", "inboundID", SkuInbound.class);
        arp.addMapping("sku_inbound_de", "id", SkuInboundDe.class);
        arp.addMapping("sku_outbound", "outboundID", SkuOutbound.class);
        arp.addMapping("sku_outbound_de", "id", SkuOutboundDe.class);
        arp.addMapping("sk_stock", "sku", SkStock.class);
        arp.addMapping("od_order", "orderID", Order.class);
        arp.addMapping("od_order_addr", "orderID", OrderAddr.class);
        arp.addMapping("od_order_de", "id", OrderDe.class);
        arp.addMapping("as_aftersaleod", "asodID", AsAftersaleod.class);
        arp.addMapping("as_aftersaleod_de", "id", AsAftersaleodDe.class);
    }
}

