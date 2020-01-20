package org.wmd.domain.payment;

import java.util.List;

import org.wmd.dao.entities.ProposedService;
import org.wmd.dao.entities.User;

public interface PaymentService {

	public boolean payServices(User user, List<ProposedService> services);
}
