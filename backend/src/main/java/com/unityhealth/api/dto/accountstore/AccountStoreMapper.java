/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.accountstore;

import com.unityhealth.api.domain.self.accountStore.AccountStore;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

/**
 *
 * @author Tabish
 */

@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL,  withCustomFields = {
        @Field({"account.id", "accountID"}),
        @Field({"store.id", "storeID"}),
        @Field({"store.group.id", "groupID"})
    })
public interface AccountStoreMapper {
    
    AccountStoreDto asAccountStoreDto(AccountStore in);
    AccountStore asAccountStore(AccountStoreDto in, AccountStore out);
    
}
