package myPackage.repository;

import myPackage.model.Course;
import org.springframework.stereotype.Repository;

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

    @Override
    public Course create(Course object) {
        return null;
    }
}
