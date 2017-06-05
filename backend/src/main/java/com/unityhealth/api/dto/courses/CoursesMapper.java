/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.api.dto.courses;

import fr.xebia.extras.selma.*;
import com.unityhealth.api.domain.self.courses.Courses;

/**
 *
 * @author Sameer S Argade
 */
@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL)
public interface CoursesMapper {
    
    CoursesDto asCoursesDto(Courses in);
    Courses asCourses(CoursesDto in, Courses out);
}
