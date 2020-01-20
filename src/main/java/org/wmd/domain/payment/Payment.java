package org.wmd.domain.payment;

import java.util.List;

import org.springframework.stereotype.Service;
import org.wmd.dao.entities.ProposedService;
import org.wmd.dao.entities.User;

@Service
public class Payment implements PaymentService {

	@Override
	public boolean payServices(User user, List<ProposedService> services) {
		int sum=0; 
		for(ProposedService service : services ) {
			sum+=service.getPrice();
		}
		double  balance = user.getProfile().getBalance(); 
		return balance >= sum;
	}

}
