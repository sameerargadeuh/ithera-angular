/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.reports;

import com.unityhealth.api.domain.self.reports.Report;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;



/**
 *
 * @author Tabish
 */
@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL,  withCustomFields = {
        @Field({"course.vDesc", "courseName"}),

    })
public interface ReportMapper {
    
    ReportDto asReportDto(Report in);
   
    Report asReport(ReportDto in, Report out);
}
