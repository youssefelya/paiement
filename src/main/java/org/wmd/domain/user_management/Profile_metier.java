package org.wmd.domain.user_management;

import java.util.List;

import org.wmd.dao.entities.Profile;

public interface Profile_metier {

	public Profile addProfil(Profile profile); 
	
	public List<Profile> getProfiles();
}
