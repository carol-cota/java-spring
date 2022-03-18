package myPackage.service;

import myPackage.model.Course;
import myPackage.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class CourseService implements CrudService<Course> {

    private CrudRepository<Course> repository;

    public CourseService(CrudRepository courseRepository) {

        repository = courseRepository;
    }

    @Override
    public List<Course> list() {
        return repository.findAll();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
