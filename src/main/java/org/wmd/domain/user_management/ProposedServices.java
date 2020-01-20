package org.wmd.domain.user_management;

import java.util.List;
import java.util.Optional;

import org.wmd.dao.entities.ProposedService;

public interface ProposedServices {
	
	
	public List<ProposedService> getServices();
	public Optional<ProposedService> getServiceById(Long serviceId);
	public ProposedService addService(ProposedService proposedService);
	
	
}
