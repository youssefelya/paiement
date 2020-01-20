package org.wmd.domain.user_management;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wmd.dao.entities.ProposedService;
import org.wmd.dao.repositories.ProposedServiceRepository;

@Service
public class ServicesCatalogue implements ProposedServices {

	@Autowired
	private ProposedServiceRepository proposedServiceRepository;

	@Override
	public List<ProposedService> getServices() {
		return proposedServiceRepository.findAll();
	}

	@Override
	public Optional<ProposedService> getServiceById(Long serviceId) {
		return proposedServiceRepository.findById(serviceId);
	}

	@Override
	public ProposedService addService(ProposedService proposedService) {
		// TODO Auto-generated method stub
		return proposedServiceRepository.save(proposedService);
	}

}
