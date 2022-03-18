package myPackage.config;

import myPackage.model.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StorageConfig {

    @Bean
    public List<Course> storage() {
        List<Course> courses = new ArrayList();
        Course springBoot = new Course(1, "Getting started with Spring Boot 2", "Learn how to build real applications with Spring Boot 2", "https://www.google.com");
        courses.add(springBoot);
        return courses;
    }
}
