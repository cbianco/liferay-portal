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

package com.liferay.portlet.dynamicdatalists.service;

/**
 * <p>
 * This class is a wrapper for {@link DDLRecordService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       DDLRecordService
 * @generated
 */
public class DDLRecordServiceWrapper implements DDLRecordService {
	public DDLRecordServiceWrapper(DDLRecordService ddlRecordService) {
		_ddlRecordService = ddlRecordService;
	}

	public com.liferay.portlet.dynamicdatalists.model.DDLRecord addRecord(
		long recordSetId,
		java.util.Map<java.lang.String, java.io.Serializable> fieldsMap,
		int displayIndex,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddlRecordService.addRecord(recordSetId, fieldsMap,
			displayIndex, serviceContext);
	}

	public com.liferay.portlet.dynamicdatalists.model.DDLRecord updateRecord(
		long recordId,
		java.util.Map<java.lang.String, java.io.Serializable> fieldsMap,
		int displayIndex, boolean merge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddlRecordService.updateRecord(recordId, fieldsMap,
			displayIndex, merge, serviceContext);
	}

	public DDLRecordService getWrappedDDLRecordService() {
		return _ddlRecordService;
	}

	public void setWrappedDDLRecordService(DDLRecordService ddlRecordService) {
		_ddlRecordService = ddlRecordService;
	}

	private DDLRecordService _ddlRecordService;
}