package org.wmd.domain.user_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wmd.dao.entities.Profile;
import org.wmd.dao.repositories.ProfileRepository;

@Service
public class ProfileImplem implements Profile_metier{

	@Autowired
	ProfileRepository profileRepository; 
	
	@Override
	public Profile addProfil(Profile profile) {
		// TODO Auto-generated method stub
		return  profileRepository.save(profile);
	}

	@Override
	public List<Profile> getProfiles() {
		// TODO Auto-generated method stub
		return profileRepository.findAll();
	}

}
