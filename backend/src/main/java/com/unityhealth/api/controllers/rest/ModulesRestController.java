/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.controllers.rest;

import com.unityhealth.api.domain.self.courses.Brand;
import com.unityhealth.api.domain.self.courses.Categories;
import com.unityhealth.api.domain.self.courses.Courses;
import com.unityhealth.api.domain.self.courses.FeaturedList;
import com.unityhealth.api.domain.self.courses.IBrandRepository;
import com.unityhealth.api.domain.self.courses.ICategoriesRepository;
import com.unityhealth.api.domain.self.courses.ICoursesRepository;
import com.unityhealth.api.domain.self.courses.Section;
import com.unityhealth.api.dto.brand.BrandDto;
import com.unityhealth.api.dto.brand.IBrandMapper;
import com.unityhealth.api.dto.categories.CategoryDto;
import com.unityhealth.api.dto.categories.ICategoryMapper;
import com.unityhealth.api.dto.courses.CoursesDto;
import com.unityhealth.api.dto.courses.CoursesMapper;
import java.util.*;
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
@RequestMapping("/api/modules")
//@PreAuthorize(value = "hasAnyRole('ROLE_USER','ROLE_RESTRICTED_USER')")
public class ModulesRestController {

    private Logger log = LoggerFactory.getLogger(ModulesRestController.class);
    private ICoursesRepository coursesRepository;
    private CoursesMapper coursesMapper;
    private IBrandRepository brandRepository;
    private IBrandMapper brandMapper;
    private ICategoryMapper categoryMapper;
    private ICategoriesRepository categoriesRepository;

    @Autowired
    ModulesRestController(ICoursesRepository coursesRepository, CoursesMapper coursesMapper,IBrandRepository brandRepository,ICategoryMapper categoryMapper,IBrandMapper brandMapper) {
        this.coursesRepository = coursesRepository;
        this.coursesMapper = coursesMapper;
        this.brandRepository = brandRepository;
        this.categoryMapper = categoryMapper;
        this.brandMapper = brandMapper;
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
    public List<CoursesDto> getHomeFeaturedModules(@RequestParam(name = "view", required = false) String view,@RequestParam(name = "brandId", required = false) String brandId,@RequestParam(name = "categoryId", required = false) String categoryId) {
List<Courses> mergedCourses = new ArrayList<Courses>();
//        List<Integer> paramList = new ArrayList<Integer>();
//        paramList.add(4);
System.out.println("the value for view " + view);
System.out.println("the value for brandId >>>>>>>>>>>>>>>>>>>>>> " + brandId);
System.out.println("the value for brandId >>>>>>>>>>>>>>>>>>>>>> " + categoryId);
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
             case "Brand":
                
                List<Courses> brandCourses = coursesRepository.findByISiteAndBrands_iIDAndBrands_BActiveOrderByVName(1, Integer.parseInt(brandId),1);
                if (brandCourses != null) {
                    System.out.println(brandCourses.size());
                }
                 mergedCourses.addAll(brandCourses);
                break; 
             case "Category":
                 List<Courses> categoryCourses = coursesRepository.findByISiteAndCategories_iIDAndBActiveOrderByVName( 1, Integer.parseInt(categoryId),1);
                  if (categoryCourses != null) {
                    System.out.println(categoryCourses.size());
                }
                   mergedCourses.addAll(categoryCourses);
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
        List<CoursesDto> coursesDtos = new ArrayList<>(mergedCourses.size());

        for (Courses courses : mergedCourses) {
            System.out.println("image name-->" + courses.getVImage() + courses.getVDesc());
            CoursesDto coursesDto = coursesMapper.asCoursesDto(courses);
            if (checkIsNew(courses.getDtDatePublished())){
                coursesDto.setBNew(1);
            }
            coursesDtos.add(coursesDto);
        }

        return coursesDtos;
    }
     @RequestMapping(value = {"/getAllBrands/", "/getAllBrands"}, method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BrandDto> getBrandList(@RequestParam(name = "view", required = false) String view) {
        List<Brand> brands = brandRepository.findAll();
         List<BrandDto> brandDtos = new ArrayList<>(brands.size());

        for (Brand brand : brands) {
            System.out.println("image name-->" + brand.getIID()+ brand.getVName());
            brandDtos.add(brandMapper.asBrandDto(brand));
        }
        return brandDtos;
    }
      @RequestMapping(value = {"/getAllCategories/", "/getAllCategories"}, method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<CategoryDto> getCategoryList(@RequestParam(name = "view", required = false) String view) {
       List<Categories> categories = coursesRepository.getCategoriesByBrandsBActiveAndBActiveOrderByCategories_VName(1, 1);
      
       // List<Courses> coursesList = coursesRepository.findCategoriesByBrandsBActiveAndBActiveOrderByCategories_VName(1, 1);
        
         List<CategoryDto> categoryDtos = new ArrayList<>();
         Set<CategoryDto> categoryDtoSet = new HashSet<>();
       //  for(Courses courses:coursesList){
         //     Set<Categories> categories = courses.getCategories();
             for (Categories category : categories) {
            System.out.println("image name-->" + category.getIID()+ category.getVName());
            //categoryDtos.add(categoryMapper.asCategoryDto(category));
            categoryDtoSet.add(categoryMapper.asCategoryDto(category));
          }
        //}
        return categoryDtoSet;
    }
  private boolean checkIsNew(Date datePub) {
        boolean isNew = false;
        if (datePub != null) {
            java.util.Date currentDate = new java.util.Date();
            Calendar cal = new GregorianCalendar();
            cal.setTime(datePub);
            cal.add(Calendar.MONTH, 1);
            java.util.Date endNew = cal.getTime();
            if (endNew.after(currentDate)) {
                isNew = true;
            }
        }        
        return isNew;
    }
}
