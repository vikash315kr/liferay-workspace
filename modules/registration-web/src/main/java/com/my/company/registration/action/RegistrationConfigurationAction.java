package com.my.company.registration.action;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.my.company.registration.action.constants.RegistrationActionPortletKeys;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = "javax.portlet.name=" + RegistrationActionPortletKeys.REGISTRATIONACTION,
		service = ConfigurationAction.class
	)
public class RegistrationConfigurationAction extends DefaultConfigurationAction {

}
