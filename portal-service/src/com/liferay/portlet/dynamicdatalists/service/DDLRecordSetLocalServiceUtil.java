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
 * The utility for the d d l record set local service. This utility wraps {@link com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordSetLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordSetLocalService
 * @see com.liferay.portlet.dynamicdatalists.service.base.DDLRecordSetLocalServiceBaseImpl
 * @see com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordSetLocalServiceImpl
 * @generated
 */
public class DDLRecordSetLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.dynamicdatalists.service.impl.DDLRecordSetLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the d d l record set to the database. Also notifies the appropriate model listeners.
	*
	* @param ddlRecordSet the d d l record set to add
	* @return the d d l record set that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet addDDLRecordSet(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet ddlRecordSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDDLRecordSet(ddlRecordSet);
	}

	/**
	* Creates a new d d l record set with the primary key. Does not add the d d l record set to the database.
	*
	* @param recordSetId the primary key for the new d d l record set
	* @return the new d d l record set
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet createDDLRecordSet(
		long recordSetId) {
		return getService().createDDLRecordSet(recordSetId);
	}

	/**
	* Deletes the d d l record set with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recordSetId the primary key of the d d l record set to delete
	* @throws PortalException if a d d l record set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDDLRecordSet(long recordSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDDLRecordSet(recordSetId);
	}

	/**
	* Deletes the d d l record set from the database. Also notifies the appropriate model listeners.
	*
	* @param ddlRecordSet the d d l record set to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDDLRecordSet(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet ddlRecordSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDDLRecordSet(ddlRecordSet);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the d d l record set with the primary key.
	*
	* @param recordSetId the primary key of the d d l record set to get
	* @return the d d l record set
	* @throws PortalException if a d d l record set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet getDDLRecordSet(
		long recordSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDLRecordSet(recordSetId);
	}

	/**
	* Gets the d d l record set with the UUID and group id.
	*
	* @param uuid the UUID of d d l record set to get
	* @param groupId the group id of the d d l record set to get
	* @return the d d l record set
	* @throws PortalException if a d d l record set with the UUID and group id could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet getDDLRecordSetByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDLRecordSetByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Gets a range of all the d d l record sets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d d l record sets to return
	* @param end the upper bound of the range of d d l record sets to return (not inclusive)
	* @return the range of d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> getDDLRecordSets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDLRecordSets(start, end);
	}

	/**
	* Gets the number of d d l record sets.
	*
	* @return the number of d d l record sets
	* @throws SystemException if a system exception occurred
	*/
	public static int getDDLRecordSetsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDLRecordSetsCount();
	}

	/**
	* Updates the d d l record set in the database. Also notifies the appropriate model listeners.
	*
	* @param ddlRecordSet the d d l record set to update
	* @return the d d l record set that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet updateDDLRecordSet(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet ddlRecordSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDDLRecordSet(ddlRecordSet);
	}

	/**
	* Updates the d d l record set in the database. Also notifies the appropriate model listeners.
	*
	* @param ddlRecordSet the d d l record set to update
	* @param merge whether to merge the d d l record set with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the d d l record set that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet updateDDLRecordSet(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet ddlRecordSet,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDDLRecordSet(ddlRecordSet, merge);
	}

	/**
	* Gets the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static com.liferay.portlet.dynamicdatalists.model.DDLRecordSet addRecordSet(
		long userId, long groupId, long ddmStructureId,
		java.lang.String recordSetKey, boolean autoRecordSetKey,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.lang.String description, int minDisplayRows,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRecordSet(userId, groupId, ddmStructureId, recordSetKey,
			autoRecordSetKey, nameMap, description, minDisplayRows,
			serviceContext);
	}

	public static void addRecordSetResources(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet recordSet,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addRecordSetResources(recordSet, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addRecordSetResources(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet recordSet,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addRecordSetResources(recordSet, communityPermissions,
			guestPermissions);
	}

	public static void deleteRecordSet(
		com.liferay.portlet.dynamicdatalists.model.DDLRecordSet recordSet)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteRecordSet(recordSet);
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

	public static void deleteRecordSets(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteRecordSets(groupId);
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

	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> getRecordSets(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRecordSets(groupId);
	}

	public static int getRecordSetsCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRecordSetsCount(groupId);
	}

	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> search(
		long companyId, long groupId, java.lang.String keywords, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(companyId, groupId, keywords, start, end,
			orderByComparator);
	}

	public static java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> search(
		long companyId, long groupId, java.lang.String recordSetKey,
		java.lang.String name, java.lang.String description,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(companyId, groupId, recordSetKey, name, description,
			andOperator, start, end, orderByComparator);
	}

	public static int searchCount(long companyId, long groupId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().searchCount(companyId, groupId, keywords);
	}

	public static int searchCount(long companyId, long groupId,
		java.lang.String recordSetKey, java.lang.String name,
		java.lang.String description, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .searchCount(companyId, groupId, recordSetKey, name,
			description, andOperator);
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

	public static DDLRecordSetLocalService getService() {
		if (_service == null) {
			_service = (DDLRecordSetLocalService)PortalBeanLocatorUtil.locate(DDLRecordSetLocalService.class.getName());

			ReferenceRegistry.registerReference(DDLRecordSetLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DDLRecordSetLocalService.class);
		}

		return _service;
	}

	public void setService(DDLRecordSetLocalService service) {
		MethodCache.remove(DDLRecordSetLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DDLRecordSetLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DDLRecordSetLocalService.class);
	}

	private static DDLRecordSetLocalService _service;
}