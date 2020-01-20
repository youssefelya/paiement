package org.wmd.mediation;

import java.util.List;

import org.wmd.dao.entities.Profile;

public interface  ProfileManagementWS {
	
	public Profile addProfile(Profile profile);
	public List<Profile> getProfiles();
}
