/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.controllers.accountstore.rest;

import com.unityhealth.api.domain.self.account.Account;
import com.unityhealth.api.domain.self.accountStore.AccountStore;
import com.unityhealth.api.domain.self.accountStore.IAccountStoreRepository;
import com.unityhealth.api.dto.accountstore.AccountStoreDto;
import com.unityhealth.api.dto.accountstore.AccountStoreMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tabish
 */
@Transactional
@RestController
@RequestMapping("/api/accountStores")
public class AccountStoreRestController {
    
    private IAccountStoreRepository accountStoreRepository;
    private AccountStoreMapper accountStoreMapper;

    @Autowired
    AccountStoreRestController(IAccountStoreRepository accountStoreRepository, AccountStoreMapper accountStoreMapper) {
        this.accountStoreRepository = accountStoreRepository;
        this.accountStoreMapper = accountStoreMapper;
    }
    
    @RequestMapping(value= {"/getAccountStorebyUserID"}, method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AccountStoreDto> getAccountStorebyUserID(Integer userID){
        
        System.out.println("the value for userID in AccountStore >>>>>>>>>>>>>>>>>>>>>> " + userID);
        
        List<AccountStore> accountStores = accountStoreRepository.findByAccount_id(userID);
        
        
        List<AccountStoreDto> accountStoresDto = new ArrayList<>();
        
        for (AccountStore accountstore : accountStores){
            
        List<Object[]> accountStores1 = accountStoreRepository.findByaccountId(userID);
            for (Object o[] : accountStores1) {
            AccountStore c = (AccountStore) o[0];
            Account l = (Account) o[1];

            //all the classes: Course, Lesson, Progress and User have the toString() overridden with the database ID; 
            System.out.printf("\nUser: %s \n Lesson: %s",l.getUsername(),c.getStore().getGroup().getId());
            }
            accountstore.setStoreCount(accountStores1.size());
        
        accountStoresDto.add(accountStoreMapper.asAccountStoreDto(accountstore));
        
        System.out.println("the value for AccountStore >>>>>>>>>>>>>>>>>>>>>> " + accountstore.getiID() + accountstore.getAccount().getId() + accountstore.getStore().getId() + " Store count " + accountstore.getStoreCount());
        }
        
        
        System.out.println("the value for AccountStore DTO >>>>>>>>>>>>>>>>>>>>>> " + accountStoresDto.toString());
        
        
        
        
        
        
        return accountStoresDto;
    }
    
    
    
    
    
}
