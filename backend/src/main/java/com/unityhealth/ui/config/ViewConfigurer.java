package com.unityhealth.ui.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tomasz Kucharzyk
 */
@Configuration
public class ViewConfigurer extends WebMvcConfigurerAdapter{

//    @Value("${imgatewayImagePath}")
//    private String imgatewayImagePath;
//
//    @Value("${itheraImagePath}")
//    private String itheraImagePath;
//
//    @Value("${imgatewayAssetPath}")
//    private String imgatewayAssetPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

//        registry
//            .addResourceHandler("/img_images/**")
//            .addResourceLocations(imgatewayImagePath)
//            .setCachePeriod((int) TimeUnit.HOURS.toSeconds(24L));
//
//        registry
//            .addResourceHandler("/ithera_images/**")
//            .addResourceLocations(itheraImagePath)
//            .setCachePeriod((int) TimeUnit.HOURS.toSeconds(24L));
//
//        registry
//            .addResourceHandler("/img_assets/**")
//            .addResourceLocations(imgatewayAssetPath)
//            .setCachePeriod((int) TimeUnit.HOURS.toSeconds(24L));

        registry
            .addResourceHandler("/**")
            .addResourceLocations("classpath:/static/")
            .setCachePeriod((int) TimeUnit.HOURS.toSeconds(24L));

    }
}
