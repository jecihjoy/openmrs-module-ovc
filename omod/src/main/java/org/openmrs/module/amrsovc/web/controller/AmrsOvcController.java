package org.openmrs.module.amrsovc.web.controller;

import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.v1_0.controller.MainResourceController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rest/" + RestConstants.VERSION_1 + AmrsOvcController.AMRS_OVC_REST_NAMESPACE)
public class AmrsOvcController extends MainResourceController {
	
	public static final String AMRS_OVC_REST_NAMESPACE = "/amrsovc";
	
	/**
	 * @see org.openmrs.module.webservices.rest.web.v1_0.controller.BaseRestController#getNamespace()
	 */
	@Override
	public String getNamespace() {
		return RestConstants.VERSION_1 + AmrsOvcController.AMRS_OVC_REST_NAMESPACE;
	}
}
