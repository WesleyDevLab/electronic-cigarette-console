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
package com.fruit.model;

import java.util.Date;

import com.fruit.core.util.DateUtils;
import com.fruit.core.view.InvokeResult;
import com.fruit.model.base.BaseDictData;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class DictData extends BaseDictData<DictData> {
	public static final DictData dao = new DictData();

	public InvokeResult saveDictData(Integer id, String name, String remark,
			Integer seq, String value, Integer typeId) {
		DictData dictData=new DictData();
		dictData.setId(id);
		dictData.setName(name);
		dictData.setSeq(seq);
		dictData.setRemark(remark);
		dictData.setValue(value);
		dictData.setDictTypeId(typeId);
		dictData.setUpdateTime(DateUtils.formatDateToUnixTimestamp(new Date()));
		if(id!=null){
			dictData.update();
		}else{
			dictData.save();
		}
		return InvokeResult.success();
	}

	public InvokeResult deleteData(Integer id) {
		this.deleteById(id);
		return InvokeResult.success();
	}
}
