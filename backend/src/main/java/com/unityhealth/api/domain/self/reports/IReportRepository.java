/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.reports;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Tabish
 */
public interface IReportRepository extends JpaRepository<Report, Integer>{
    
    List<Report> findByAccount_id(Integer userID);

    
    @Query("SELECT r FROM Report r, Account a, Courses c WHERE r.account.store.id = ?1 ")
    List<Report> findBystoreId(Integer id);
    
    
}
