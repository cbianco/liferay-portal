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

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the d d l record set remote service. This utility wraps {@link com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordSetServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordSetService
 * @see com.liferay.portlet.dynamicdatalists.service.base.DDLRecordSetServiceBaseImpl
 * @see com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordSetServiceImpl
 * @generated
 */
public class DDLRecordSetServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordSetServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet addRecordSet(
		long groupId, long ddmStructureId, java.lang.String recordSetKey,
		boolean autoRecordSetKey,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.lang.String description, int minDisplayRows,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRecordSet(groupId, ddmStructureId, recordSetKey,
			autoRecordSetKey, nameMap, description, minDisplayRows,
			serviceContext);
	}

	public static void deleteRecordSet(long recordSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteRecordSet(recordSetId);
	}

	public static void deleteRecordSet(long groupId,
		java.lang.String recordSetKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteRecordSet(groupId, recordSetKey);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet getRecordSet(
		long recordSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRecordSet(recordSetId);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet getRecordSet(
		long groupId, java.lang.String recordSetKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRecordSet(groupId, recordSetKey);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet updateMinDisplayRows(
		long recordSetId, int minDisplayRows,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateMinDisplayRows(recordSetId, minDisplayRows,
			serviceContext);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet updateRecordSet(
		long groupId, long ddmStructureId, java.lang.String recordSetKey,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.lang.String description, int minDisplayRows,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateRecordSet(groupId, ddmStructureId, recordSetKey,
			nameMap, description, minDisplayRows, serviceContext);
	}

	public static DDLRecordSetService getService() {
		if (_service == null) {
			_service = (DDLRecordSetService)PortalBeanLocatorUtil.locate(DDLRecordSetService.class.getName());

			ReferenceRegistry.registerReference(DDLRecordSetServiceUtil.class,
				"_service");
			MethodCache.remove(DDLRecordSetService.class);
		}

		return _service;
	}

	public void setService(DDLRecordSetService service) {
		MethodCache.remove(DDLRecordSetService.class);

		_service = service;

		ReferenceRegistry.registerReference(DDLRecordSetServiceUtil.class,
			"_service");
		MethodCache.remove(DDLRecordSetService.class);
	}

	private static DDLRecordSetService _service;
}