/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.controllers.rest;

import com.unityhealth.api.domain.self.courses.Courses;
import com.unityhealth.api.domain.self.courses.FeaturedList;
import com.unityhealth.api.domain.self.courses.ICoursesRepository;
import com.unityhealth.api.domain.self.courses.Section;
import com.unityhealth.api.dto.courses.CoursesDto;
import com.unityhealth.api.dto.courses.CoursesMapper;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sameer S Argade
 */
@Transactional
@RestController
@RequestMapping("/api/util")
//@PreAuthorize(value = "hasAnyRole('ROLE_USER','ROLE_RESTRICTED_USER')")
public class ModulesRestController {

    private Logger log = LoggerFactory.getLogger(ModulesRestController.class);
    ICoursesRepository coursesRepository;
    private CoursesMapper coursesMapper;

    @Autowired
    ModulesRestController(ICoursesRepository coursesRepository, CoursesMapper coursesMapper) {
        this.coursesRepository = coursesRepository;
        this.coursesMapper = coursesMapper;
    }

    @RequestMapping(value = {"/getFeaturedModules/", "/getFeaturedModules"}, method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Courses> getFeaturedModules() {

        List<Integer> paramList = new ArrayList<Integer>();
        paramList.add(4);
//      List<Courses> featuredCourses = coursesRepository.findByISiteAndFeaturedModules_FeaturedList_iIDOrderByVName(1,4);
//      if(featuredCourses != null){
//          System.out.println( featuredCourses.size());
//      }
//          
//      for(Courses courses:featuredCourses){
//          System.out.println(courses.toString());
//      }
//       return  featuredCourses;
        return null;
    }

    @RequestMapping(value = {"/getAllItheraModules/", "/getAllItheraModules"}, method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Courses> getAllItheraModules() {

//        List<Integer> paramList = new ArrayList<Integer>();
//        paramList.add(4);
        List<Courses> featuredCourses = coursesRepository.findByISiteAndIOwnerGroupIDAndBActiveOrderByVName(1, 0, 1);
        if (featuredCourses != null) {
            System.out.println(featuredCourses.size());
        }

        for (Courses courses : featuredCourses) {
            System.out.println(courses.toString());
        }
        return featuredCourses;
    }

    @RequestMapping(value = {"/getHomeFeaturedModules/", "/getHomeFeaturedModules"}, method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CoursesDto> getHomeFeaturedModules(@RequestParam(name = "view", required = false) String view) {
List<Courses> mergedCourses = new ArrayList<Courses>();
//        List<Integer> paramList = new ArrayList<Integer>();
//        paramList.add(4);
System.out.println("the value for view " + view);
        switch (view) {
            case "Featured":
                FeaturedList featuredList = new FeaturedList();
                featuredList.setIID(4);
                List<Courses> featuredCourses = coursesRepository.findByISiteAndFeaturedListAndBActiveOrderByVName(1, featuredList, 1);
                 mergedCourses.addAll(featuredCourses);
                break;
            case "Accredited":
                 List<Courses> accreditatedCourses = coursesRepository.findByISiteAndBAccredAndBActiveOrderByVName(1,1,1);
                mergedCourses.addAll(accreditatedCourses);
                break;
            case "Product":
                Section product = new Section();
                product.setIID(1);
                List<Courses> productCourses = coursesRepository.findByISiteAndSectionAndBActiveOrderByVName(1, product, 1);
                if (productCourses != null) {
                    System.out.println(productCourses.size());
                }
                 mergedCourses.addAll(productCourses);
                break;
            case "Condition":
                Section conditionEntity = new Section();
                conditionEntity.setIID(2);
                List<Courses> conditionCourses = coursesRepository.findByISiteAndSectionAndBActiveOrderByVName(1, conditionEntity, 1);
                if (conditionCourses != null) {
                    System.out.println(conditionCourses.size());
                }
                 mergedCourses.addAll(conditionCourses);
                break;

            default:
                List<Courses> allCourses = coursesRepository.findByISiteAndIOwnerGroupIDAndBActiveOrderByVName(1, 0, 1);
                if (allCourses != null) {
                    System.out.println(allCourses.size());
                }
                mergedCourses.addAll(allCourses);
                break;
        }
        FeaturedList featuredList = new FeaturedList();
        featuredList.setIID(4);
//      List<Courses> featuredCourses = coursesRepository.findByISiteAndFeaturedListAndBActiveOrderByVName(1,featuredList,1);
//      if(featuredCourses != null){
//          System.out.println( featuredCourses.size());
//      }
//    List<Courses> allCourses = coursesRepository.findByISiteAndIOwnerGroupIDAndBActiveOrderByVName(1,0,1);
//      if(allCourses != null){
//          System.out.println( allCourses.size());
//      }
//Section sectionEntity = new Section();
//sectionEntity.setIID(1);
//       List<Courses> sectionCourses = coursesRepository.findByISiteAndSectionAndBActiveOrderByVName(1,sectionEntity,1);
//      if(sectionCourses != null){
//          System.out.println( sectionCourses.size());
//      }
        
        
        //  mergedCourses.addAll(featuredCourses);
//     List<Courses> accreditatedCourses = coursesRepository.findByISiteAndBAccredAndBActiveOrderByVName(1,1,1);
        //    mergedCourses.addAll(accreditatedCourses);
//      for(Courses courses:mergedCourses){
//          System.out.println(courses.toString());
//      }
//       return  featuredCourses;
        List<CoursesDto> coursesDtos = new ArrayList<>(mergedCourses.size());

        for (Courses courses : mergedCourses) {
            System.out.println("image name-->" + courses.getVImage() + courses.getVDesc());
            coursesDtos.add(coursesMapper.asCoursesDto(courses));
        }

        return coursesDtos;
    }

}
