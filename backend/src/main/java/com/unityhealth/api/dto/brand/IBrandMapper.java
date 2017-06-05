/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.brand;
import com.unityhealth.api.domain.self.courses.Brand;
import fr.xebia.extras.selma.*;


/**
 *
 * @author Sameer S Argade
 */
@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL)
public interface IBrandMapper {
    
  BrandDto asBrandDto (Brand in );
  Brand asBrand ( BrandDto in, Brand out);
    
}
