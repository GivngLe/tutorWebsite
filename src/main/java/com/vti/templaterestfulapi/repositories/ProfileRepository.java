package com.vti.templaterestfulapi.repositories;


import com.vti.templaterestfulapi.models2.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProfileRepository extends MongoRepository<Profile, Long> {
    List<Profile> findAllByName();
}
