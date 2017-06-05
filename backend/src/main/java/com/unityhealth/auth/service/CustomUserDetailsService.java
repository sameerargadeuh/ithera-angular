package com.unityhealth.auth.service;

import com.unityhealth.api.domain.self.account.Account;
import com.unityhealth.api.domain.self.account.AccountRepository;
import com.unityhealth.api.domain.self.accountStore.AccountStore;
import com.unityhealth.api.domain.self.companyUsers.CompanyUsers;
import com.unityhealth.api.domain.self.companyUsers.CompanyUsersRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by shanefox on 10/10/2016.
 */
@Service("userDetailsService")
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(CustomUserDetailsService.class);

    private AccountRepository accountRepository;
    
    private CompanyUsersRepository  companyUsersRepository;

    @Autowired
    public CustomUserDetailsService(AccountRepository accountRepository,CompanyUsersRepository companyUsersRepository) {
        this.accountRepository = accountRepository;
        this.companyUsersRepository = companyUsersRepository;
    }
//    @Autowired
//    public CustomUserDetailsService(CompanyUsersRepository companyUsersRepository) {
//        this.companyUsersRepository = companyUsersRepository;
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.debug(">>>>> loadUserByUsername({})", username);
        try {
            Account account = accountRepository.findByUsername(username);
            CompanyUsers companyUsers = null;
//            // Touch the account stores
//            for (AccountStore accountStore : account.getAccountStores()) {
//                accountStore.getStore().getGroup();
//            }

            if (account == null) {
                companyUsers = companyUsersRepository.findByUsername(username);
                if (companyUsers == null) {
                    throw new UsernameNotFoundException("Username not found");
                }
                log.debug("<<<<< companyUsers({})", companyUsers);
                return new CustomUserDetails(companyUsers);
            }
            return new CustomUserDetails(account);
        } finally {
            log.debug("<<<<< loadUserByUsername({})", username);
        }
    }

}
