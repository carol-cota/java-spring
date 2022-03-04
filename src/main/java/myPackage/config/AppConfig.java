package myPackage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("myPackage")
@EnableWebMvc
public class AppConfig {

//    @Bean("courseRepository")
//    public CourseRepository getCourseRepository() {
//        return new CourseRepository();
//    }
//
//    @Bean("courseService")
//    public CourseService getCourseService() {
//        return new CourseService(getCourseRepository());
//    }
}