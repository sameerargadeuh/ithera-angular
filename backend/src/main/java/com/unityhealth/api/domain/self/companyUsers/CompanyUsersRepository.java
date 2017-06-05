package com.unityhealth.api.domain.self.companyUsers;

import org.springframework.data.repository.CrudRepository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;

/**
 * Created by shanefox on 10/10/2016.
 */
public interface CompanyUsersRepository extends CrudRepository<CompanyUsers, Integer> {

    CompanyUsers findByUsername(String username);
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update CompanyUsers a set a.sherpaOptIn = ?1 where a.username = ?2")
    int setSherpaOptIn(Integer sherpaOptIn, String username);
   
}
