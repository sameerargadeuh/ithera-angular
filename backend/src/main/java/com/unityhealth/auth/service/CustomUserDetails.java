package com.unityhealth.auth.service;

import com.unityhealth.api.domain.self.account.Account;
import com.unityhealth.api.domain.self.companyUsers.CompanyUsers;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by shanefox on 10/10/2016.
 */
public class CustomUserDetails implements UserDetails {

    private Account account;
    private CompanyUsers companyUsers;

    public CustomUserDetails(Account account) {
        this.account = account;
    }

    public CustomUserDetails(CompanyUsers companyUsers) {
        this.companyUsers = companyUsers;
    }
    public Account getAccount() {
       /* if(this.account == null && this.companyUsers != null ){
            account = new Account();
            account.setId(companyUsers.getId());
            account.setEmail(companyUsers.getEmail());
            account.setPassword(companyUsers.getPassword());
            account.setUsername(companyUsers.getUsername());
            account.setSalt(companyUsers.getSalt());
            account.setSherpaOptIn(companyUsers.getSherpaOptIn());
        }*/
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       
        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
 if((account != null) && (account.getProfesion().equalsIgnoreCase("Head_Office_Buyer") || account.getProfesion().equalsIgnoreCase("Dispensary_Assistant") || account.getProfesion().equalsIgnoreCase("Pharmacy_Assistant") )){
     grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_RESTRICTED_USER")); 
        }else{
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));    
        }
        
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        if(account!=null)
        return account.getPassword() + "{" + account.getSalt() + "}";
        return companyUsers.getPassword() + "{" + companyUsers.getSalt() + "}";
    }

    @Override
    public String getUsername() {
        if(account!=null)
            return account.getUsername();
            return companyUsers.getUsername();
        
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public CompanyUsers getCompanyUsers() {
        return companyUsers;
    }

    public void setCompanyUsers(CompanyUsers companyUsers) {
        this.companyUsers = companyUsers;
    }
}
