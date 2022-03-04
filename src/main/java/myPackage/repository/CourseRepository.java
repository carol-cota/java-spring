package myPackage.repository;

import myPackage.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
class CourseRepository implements CrudRepository<Course>{

    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        Course springBoot = new Course(1, "Getting started with Spring Boot 2", "Learn how to build real applications with Spring Boot 2", "https://www.google.com");

        courses.add(springBoot);
        return courses;
    }
}
