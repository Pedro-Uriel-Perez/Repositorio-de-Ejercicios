package mx.utng.session26.model.dao;

import java.util.List;

import mx.utng.session26.model.entity.Course;

public interface ICourseDao {
    List<Course> list();
    void save(Course course);
    Course getById(Long id);
    void delete(Long id);
}