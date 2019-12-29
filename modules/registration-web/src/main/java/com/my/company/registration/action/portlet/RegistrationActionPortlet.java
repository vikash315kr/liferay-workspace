package com.my.company.registration.action.portlet;

import com.my.company.registration.action.constants.RegistrationActionPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author VIKAS
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.example",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=RegistrationAction",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/view.jsp",
		"javax.portlet.init-param.config-template=/html/configuration.jsp",
		"javax.portlet.name=" + RegistrationActionPortletKeys.REGISTRATIONACTION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RegistrationActionPortlet extends MVCPortlet {
}