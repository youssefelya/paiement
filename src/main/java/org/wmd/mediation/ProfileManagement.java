package org.wmd.mediation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wmd.dao.entities.Profile;
import org.wmd.domain.user_management.Profile_metier;

@CrossOrigin(origins = "*")
@RestController
public class ProfileManagement  implements ProfileManagementWS {

	@Autowired
	Profile_metier profile_metier; 
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	@Override
	public Profile addProfile(@RequestBody Profile profile) {
		// TODO Auto-generated method stub
		return  profile_metier.addProfil(profile);
	}

	@RequestMapping(value = "/profiles", method = RequestMethod.GET)
	@Override
	public List<Profile> getProfiles() {
		// TODO Auto-generated method stub
		return profile_metier.getProfiles();
	}

}
