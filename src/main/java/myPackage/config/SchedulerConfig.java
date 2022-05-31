package myPackage.config;

import myPackage.model.Course;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Configuration
@EnableScheduling
@EnableAsync
public class SchedulerConfig {

    public SchedulerConfig(List<Course> courses) {
        this.courses = courses;
    }
    private List<Course> courses;

    @Async
    @Scheduled(fixedRate = 1000)
    public void createCourse() {
        Course newCourse = new Course(2, "Scheduler working", "How to make your scheduler work", "https://google.com");
        courses.add(newCourse);
    }
}
