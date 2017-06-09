/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.accountStore;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 *
 * @author Sameer S Argade
 */
public interface IAccountStoreRepository extends JpaRepository<AccountStore, Integer>  {
  
 @Query("SELECT ast,act2 FROM AccountStore ast,Account act2,Group grp  where ast.store.id = ast.account.store.id  "
         + " and ast.account.id = ?1 and ast.store.id =  act2.store.id and ast.store.group.id = grp.id")
    List<Object[]> findByaccountId(Integer id); 
}
