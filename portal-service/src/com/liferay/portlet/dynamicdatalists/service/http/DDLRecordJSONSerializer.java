/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.dynamicdatalists.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import com.liferay.portlet.dynamicdatalists.model.DDLRecord;

import java.util.List;

/**
 * @author    Brian Wing Shun Chan
 * @generated
 */
public class DDLRecordJSONSerializer {
	public static JSONObject toJSONObject(DDLRecord model) {
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		jsonObject.put("uuid", model.getUuid());
		jsonObject.put("recordId", model.getRecordId());
		jsonObject.put("classNameId", model.getClassNameId());
		jsonObject.put("classPK", model.getClassPK());
		jsonObject.put("recordSetId", model.getRecordSetId());
		jsonObject.put("displayIndex", model.getDisplayIndex());

		return jsonObject;
	}

	public static JSONArray toJSONArray(
		com.liferay.portlet.dynamicdatalists.model.DDLRecord[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (DDLRecord model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.liferay.portlet.dynamicdatalists.model.DDLRecord[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (DDLRecord[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.liferay.portlet.dynamicdatalists.model.DDLRecord> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (DDLRecord model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}