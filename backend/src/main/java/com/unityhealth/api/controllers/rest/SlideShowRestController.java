/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.controllers.rest;

import com.unityhealth.api.domain.self.banners.Banner;
import com.unityhealth.api.domain.self.banners.IBannersRepository;
import com.unityhealth.api.domain.self.banners.SlideShow;
import com.unityhealth.api.dto.banners.BannersDto;
import com.unityhealth.api.dto.banners.IBannerMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sameer S Argade
 */
@Transactional
@RestController
@RequestMapping("/api/slideshow")
public class SlideShowRestController {
    
     private IBannersRepository bannersRepository;
     private IBannerMapper bannerMapper;
      @Autowired
      SlideShowRestController( IBannersRepository bannersRepository, IBannerMapper bannerMapper){
          this.bannersRepository = bannersRepository;
          this.bannerMapper = bannerMapper;
      }
      @RequestMapping(value = {"/getBanners/", "/getBanners"}, method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
      List<BannersDto> getAllItheraModules() {
          List<BannersDto> bannerDtos = new ArrayList<BannersDto>();
           Iterable<SlideShow> ss = bannersRepository.findAll();
  
  for(SlideShow ss2:ss){
      System.out.println(ss2.getBanners().size());
      Set<Banner> banners = ss2.getBanners();
      for(Banner banner:banners){
          BannersDto bannersDto = bannerMapper.asBannerDto(banner);
          bannerDtos.add(bannersDto);
      }
  }
          return bannerDtos;
      }
}
