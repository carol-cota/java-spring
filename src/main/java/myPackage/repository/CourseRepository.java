package myPackage.repository;

import myPackage.model.Course;
import myPackage.service.CrudService;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
class CourseRepository implements CrudRepository<Course>{

    public CourseRepository(List<Course> courses) {
        this.courses = courses;
    }

    private List<Course> courses;

    @Override
    public List<Course> findAll() {
        return courses;
    }
}
