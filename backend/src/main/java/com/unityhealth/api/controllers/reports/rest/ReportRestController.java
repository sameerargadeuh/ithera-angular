/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.controllers.reports.rest;

import com.unityhealth.api.domain.self.reports.IReportRepository;
import com.unityhealth.api.domain.self.reports.Report;
import com.unityhealth.api.dto.accountstore.AccountStoreDto;
import com.unityhealth.api.dto.reports.ReportDto;
import com.unityhealth.api.dto.reports.ReportMapper;
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
@RequestMapping("/api/reports")
public class ReportRestController {
    
    private IReportRepository reportRepository;
    private ReportMapper reportMapper;
    
    @Autowired
    ReportRestController(IReportRepository reportRepository, ReportMapper reportMapper){
        this.reportRepository = reportRepository;
        this.reportMapper = reportMapper;
    }
    
     @RequestMapping(value= {"/getUserCourseStats"}, method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReportDto> getUserCourseStats(Integer breezeID){
        
        List<Report> reports = reportRepository.findBystoreId(6099);
        
        List<ReportDto> reportsDto = new ArrayList<>();
        
        return reportsDto;
    
    }
 
    
}
