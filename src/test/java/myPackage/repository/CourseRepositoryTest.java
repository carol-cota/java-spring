package myPackage.repository;

import myPackage.model.Course;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CourseRepositoryTest {
    List<Course> courses = mock(List.class);
    CourseRepository courseRepository = new CourseRepository(courses);

    @Test
    void shouldReturnListOfCourses() {
        assertIterableEquals(courses, courseRepository.findAll());
    }
}