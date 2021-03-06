/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.categories;
import com.unityhealth.api.domain.self.courses.Categories;
import fr.xebia.extras.selma.*;


/**
 *
 * @author Sameer S Argade
 */
@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL)
public interface ICategoryMapper {
   CategoryDto asCategoryDto(Categories in );
   Categories asCategories(CategoryDto in, Categories out);
}
