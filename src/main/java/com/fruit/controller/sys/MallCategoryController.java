/**
 * Copyright (c) 2011-2016, Eason Pan(pylxyhome@vip.qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fruit.controller.sys;

import java.util.List;

import com.fruit.core.auth.anno.RequiresPermissions;
import com.fruit.core.controller.BaseController;
import com.fruit.core.util.JqGridModelUtils;
import com.fruit.core.view.InvokeResult;
import com.fruit.model.MallCategory;
import com.fruit.model.SysRes;
import com.fruit.model.SysRole;
import com.fruit.model.SysUser;
import com.jfinal.aop.Before;
import com.jfinal.kit.JsonKit;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.tx.Tx;

/**
 * 类别管理.
 * @author eason
 */
public class MallCategoryController extends BaseController {
	
	@RequiresPermissions(value={"/mall/category"}) 
	public void index() {
		this.renderJsp("category_index.jsp");
	}
	
	@RequiresPermissions(value={"/mall/category"})
	public void  getTreeGridView(){
		this.renderJson(MallCategory.me.getTreeGridView());
	}
	

	@RequiresPermissions(value={"/mall/category"})
	public void getListData() {
		String keyword=this.getPara("name");
		Page<SysUser> pageInfo=SysUser.me.getSysUserPage(getPage(), this.getRows(),keyword,this.getOrderbyStr());
		this.renderJson(JqGridModelUtils.toJqGridView(pageInfo)); 
	}
	

	@RequiresPermissions(value={"/mall/category"})
	public void setVisible(){
		Integer visible=this.getParaToInt("visible");
		String ids=this.getPara("ids");
		InvokeResult result=SysUser.me.setVisible(ids, visible);
		this.renderJson(result);
	}

	@RequiresPermissions(value={"/mall/category"})
	public void  add(){
		Integer id=getParaToInt("id");
		if(id!=null){
			SysRes sysRes=SysRes.me.getById(id);
			if(sysRes!=null){
				Integer pid = (Integer)sysRes.getInt("pid");
				if(pid!=null){//获取父资源
					SysRes pRes=SysRes.me.getById(pid);
					setAttr("pRes",pRes);
				}
			}
		setAttr("sysRes",sysRes);
		}
		setAttr("jsonTree",JsonKit.toJson(SysRes.me.getZtreeViewList()));
		this.renderJsp("category_add.jsp");
	}
	
	@RequiresPermissions(value={"/mall/category"})
	public void save(){
		String username=this.getPara("name");
		String password=this.getPara("password");
		String phone=this.getPara("phone");
		String email=this.getPara("email");
		Integer id=this.getParaToInt("id");
		String des=this.getPara("des");
		String wxid=this.getPara("wxid");
		InvokeResult result=SysUser.me.save(id, username, password, des,phone, email,wxid);
		this.renderJson(result); 
	}
	
	
	@RequiresPermissions(value={"/mall/category"})
	public void userRoleSetting() {
		Integer uid=this.getParaToInt("uid");
		this.setAttr("item", SysUser.me.findById(uid));
		InvokeResult result=SysRole.me.getRoleZtreeViewList(uid);
		this.setAttr("jsonTree", result);
		render("user_role_setting.jsp");
	}
	
	
	@RequiresPermissions(value={"/mall/category"})
	@Before(Tx.class)
	public void saveUserRoles(){
		Integer uid=this.getParaToInt("id");
		String roleIds=this.getPara("roleIds");
		InvokeResult result=SysUser.me.changeUserRoles(uid, roleIds);
		this.renderJson(result);
	}
}





