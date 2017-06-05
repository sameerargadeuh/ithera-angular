/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.domain.self.courses;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;


/**
 *
 * @author Sameer S Argade
 */

public interface ICoursesRepository extends JpaRepository<Courses,Integer>{
   //List<Courses>  findByProductBrandIdOrderByNameAsc(Integer productBrandId);
//    @Query("SELECT m.* FROM tblcourses m, tblfeaturedlist fl, tblfeaturedmodules fm WHERE m.iCourseID=fm.iModuleID and fl.iID=fm.iFeaturedID "
//            + " AND fl.iID= ?2 and m.iSite =?1 order by m.vName")
   //List<Courses>  findByISiteAndFeaturedModules_FeaturedList_iIDOrderByVName(Integer iSite,Integer featuredListId);
    //@Query("SELECT m.* FROM tblcourses m, tblbrand b WHERE m.iBrandID=b.iID AND m.iOwnerGroupID=?2 AND m.iSite=?1 AND m.bActive=1 order by m.vName") 
     List<Courses>  findByISiteAndIOwnerGroupIDAndBActiveOrderByVName(Integer iSite,Integer iOwnerGroupID,Integer bActive);
     
      List<Courses>  findByISiteAndFeaturedListAndBActiveOrderByVName(Integer iSite,FeaturedList featuredList,Integer bActive);
      List<Courses>  findByISiteAndBAccredAndBActiveOrderByVName(Integer iSite,Integer bAccred,Integer bActive);
       List<Courses>  findByISiteAndSectionAndBActiveOrderByVName(Integer iSite,Section section,Integer bActive);
}
