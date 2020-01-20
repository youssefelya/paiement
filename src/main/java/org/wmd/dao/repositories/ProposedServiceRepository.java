package org.wmd.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wmd.dao.entities.ProposedService;

public interface ProposedServiceRepository extends JpaRepository<ProposedService, Long> {

}
