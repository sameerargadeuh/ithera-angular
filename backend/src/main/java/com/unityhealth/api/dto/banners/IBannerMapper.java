/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.banners;

import com.unityhealth.api.domain.self.banners.Banner;
import fr.xebia.extras.selma.*;

/**
 *
 * @author Sameer S Argade
 */
@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL)
public interface IBannerMapper {
    BannersDto asBannerDto(Banner in);
      Banner      asBanner(BannersDto in,Banner out);
}
