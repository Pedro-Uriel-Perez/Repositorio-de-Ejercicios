package mx.utng.session26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.session26.model.entity.Course;
/*
 * Clase repositorio o dao, utilizare la 
 * anotacion @Repository
 */

@Repository
public class CourseDaoImpl implements ICourseDao{

    //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidads y
    //utiliza como una cache datos de BD
    //@PersistenceContext
    @Autowired
    private EntityManager em;


    @SuppressWarnings("unchecked")
    @Override
    public List<Course> list() {
        return em.createQuery("from Course").getResultList();
    }

    @Override
    public void save(Course course) {
        System.out.println("Course id="+course.getId());
        if(course.getId() != null && course.getId() >0){
            //Actualizo estudiante
            em.merge(course);
        }else{
            //Creamos nuevo estudiante en la base
            em.persist(course);
        }
    }

    @Override
    public Course getById(Long id) {
        return em.find(Course.class, id);
    }

    @Override
    public void delete(Long id) {
        Course course = getById(id);
        em.remove(course);
    }

    
}
