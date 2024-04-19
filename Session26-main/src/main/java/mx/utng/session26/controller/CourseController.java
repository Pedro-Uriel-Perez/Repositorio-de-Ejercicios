package mx.utng.session26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.session26.model.entity.Course;
import mx.utng.session26.model.service.ICourseService;

@Controller
@SessionAttributes("course")
public class CourseController {

    @Autowired
    private ICourseService service;

    @GetMapping({"/course", "/course/", "/course/list"})
    public String list(Model model) {
        model.addAttribute("title", "Listado de Materias");
        model.addAttribute("courses", service.list());
        return "course-list";
    }

    @GetMapping("/course/form")
    public String create(Model model) {
        model.addAttribute("title", "Formulario de Materias");
        model.addAttribute("course", new Course());
        return "course-form";
    }

    @PostMapping("/course/form")
    public String save(@Valid Course course, BindingResult br, Model model) {
        if (br.hasErrors()) {
            model.addAttribute("title", "Formulario de Materias");
            return "course-form";
        }
        service.save(course);
        return "redirect:/course/list";
    }

    @GetMapping("/course/form/{id}")
    public String update(@PathVariable Long id, Model model) {
        Course course;
        if (id > 0) {
            course = service.getById(id);
        } else {
            return "redirect:/course/list";
        }
        model.addAttribute("title", "Editar Formulario de Materias");
        model.addAttribute("course", course);
        return "course-form";
    }

    @GetMapping("/course/delete/{id}")
    public String delete(@PathVariable Long id) {
        if (id > 0) {
            service.delete(id);
        }
        return "redirect:/course/list";
    }
}
