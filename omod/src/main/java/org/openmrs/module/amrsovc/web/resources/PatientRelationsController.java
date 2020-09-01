package org.openmrs.module.amrsovc.web.resources;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.amrsovc.api.PatientRelationsService;
import org.openmrs.module.amrsovc.models.PatientRelations;
import org.openmrs.module.amrsovc.web.controller.AmrsOvcController;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.DefaultRepresentation;
import org.openmrs.module.webservices.rest.web.representation.FullRepresentation;
import org.openmrs.module.webservices.rest.web.representation.RefRepresentation;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DataDelegatingCrudResource;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
import org.openmrs.module.webservices.rest.web.resource.impl.NeedsPaging;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

import java.util.List;

@Resource(name = RestConstants.VERSION_1 + AmrsOvcController.AMRS_OVC_REST_NAMESPACE + "/relations", supportedClass = PatientRelations.class, supportedOpenmrsVersions = {
        "1.9.*", "1.10.*", "1.11.*", "1.12.*", "2.0.*", "2.1.*", "2.2.*", "2.3.*", "2.3.*" })
public class PatientRelationsController extends DataDelegatingCrudResource<PatientRelations> {
	
	private static final Log log = LogFactory.getLog(PatientRelationsService.class);
	
	private PatientRelationsService patientRelationsService;
	
	@Override
	public PatientRelations getByUniqueId(String s) {
		return null;
	}
	
	@Override
	protected void delete(PatientRelations patientRelations, String s, RequestContext requestContext)
	        throws ResponseException {
		
	}
	
	@Override
	public PatientRelations newDelegate() {
		return null;
	}
	
	@Override
	public PatientRelations save(PatientRelations patientRelations) {
		return null;
	}
	
	@Override
	public void purge(PatientRelations patientRelations, RequestContext requestContext) throws ResponseException {
		
	}
	
	@Override
	public DelegatingResourceDescription getRepresentationDescription(Representation rep) {
		DelegatingResourceDescription description;
		
		if (rep instanceof DefaultRepresentation || rep instanceof FullRepresentation || rep instanceof RefRepresentation) {
			description = new DelegatingResourceDescription();
			description.addProperty("relation_id");
			description.addProperty("uuid");
			description.addProperty("relationType");
			description.addProperty("patient_id", Representation.DEFAULT);
			return description;
		} else {
			return null;
		}
	}
	
	@Override
	protected NeedsPaging doGetAll(RequestContext context) throws ResponseException {
		patientRelationsService = Context.getService(PatientRelationsService.class);
		List<PatientRelations> relations = patientRelationsService.getAllRelationships();
		log.info("AMRS OVC");
		log.info(relations);
		return new NeedsPaging<PatientRelations>(relations, context);
	}
}
