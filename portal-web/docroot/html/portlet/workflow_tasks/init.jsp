<%
/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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
%>

<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.liferay.portal.kernel.workflow.ContextConstants" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowEngineManagerUtil" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowException" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowHandler" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowInstance" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowInstanceManagerUtil" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowLog" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowLogManagerUtil" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowTask" %>
<%@ page import="com.liferay.portal.kernel.workflow.WorkflowTaskManagerUtil" %>
<%@ page import="com.liferay.portal.kernel.workflow.comparator.WorkflowLogCreateDateComparator" %>

<%
Format dateFormatDate = FastDateFormatFactoryUtil.getDate(locale, timeZone);
Format dateFormatDateTime = FastDateFormatFactoryUtil.getDateTime(locale, timeZone);
%>

<%!
private boolean _isWorkflowTaskAssignedToUser(WorkflowTask workflowTask, User user) {
	if ((workflowTask.getAssigneeUserId() == user.getUserId()) ||
		(Validator.equals(workflowTask.getAssigneeEmailAddress(), user.getEmailAddress()))) {

		return true;
	}

	return false;
}
%>