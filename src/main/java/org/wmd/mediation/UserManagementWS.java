package org.wmd.mediation;

import java.util.List;
import java.util.Optional;

import org.wmd.dao.entities.ProposedService;

public interface UserManagementWS {

	public List<ProposedService> showServices();
	
	public ProposedService addService(ProposedService prosedService);
	
	public Optional<ProposedService> getServiceDetails(Long serviceId);

}
