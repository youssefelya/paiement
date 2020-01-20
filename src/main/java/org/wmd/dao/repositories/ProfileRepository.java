package org.wmd.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wmd.dao.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
