package myPackage.controller;

import myPackage.model.Course;
import myPackage.service.CrudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private CrudService<Course> service;

    public CourseController(CrudService<Course> service) {
        this.service = service;
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        List<Course> courses = service.list();

        return courses;
    }

    @GetMapping("/course/new")
    public List<Course> create() {
        List<Course> courses = service.list();

        return courses;
    }

}
