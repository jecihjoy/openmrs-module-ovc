package org.openmrs.module.amrsovc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.BaseModuleActivator;

public class AmrsOvcModuleActivator extends BaseModuleActivator {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	public void started() {
		log.info("Started Patienttodos");
	}
	
	public void shutdown() {
		log.info("Shutdown Patienttodos");
	}
	
}
