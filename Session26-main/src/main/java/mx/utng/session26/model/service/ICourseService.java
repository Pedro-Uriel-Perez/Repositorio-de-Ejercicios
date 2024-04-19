package mx.utng.session26.model.service;

import mx.utng.session26.model.entity.Course;
import java.util.List;

public interface ICourseService {
    List<Course> list();
    void save(Course course);
    Course getById(Long id);
    void delete(Long id);
}
