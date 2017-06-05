package com.unityhealth.api.domain.self.account;

import org.springframework.data.repository.CrudRepository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;

/**
 * Created by shanefox on 10/10/2016.
 */
public interface AccountRepository extends CrudRepository<Account, Integer> {

    Account findByUsername(String username);
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Account a set a.sherpaOptIn = ?1 where a.username = ?2")
    int setSherpaOptIn(Integer sherpaOptIn, String username);
   
}
