package crud.melashvili.databaseinteractions.rest;

import crud.melashvili.databaseinteractions.dao.AppDAOImpl;
import crud.melashvili.databaseinteractions.entity.Lecturer;
import crud.melashvili.databaseinteractions.entity.Student;
import crud.melashvili.databaseinteractions.entity.Subjects;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nika-api")
public class CRUDController {

    // main service

    private AppDAOImpl appDAO;

    public CRUDController(AppDAOImpl appDAO) {
        this.appDAO = appDAO;
    }

    // GET methods

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = appDAO.findStudents();
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getOneStudent(@PathVariable int id){
        Student student = appDAO.findStudentById(id);
        return student;
    }

    @GetMapping("/subjects")
    public List<Subjects> getSubjects() {
        List<Subjects> subjects = appDAO.findSubjects();
        return subjects;
    }

    @GetMapping("/subjects/{id}")
    public Subjects getOneSubject(@PathVariable int id){
        Subjects subjects = appDAO.findSubjectById(id);
        return subjects;
    }

    @GetMapping("/lecturers")
    public List<Lecturer> getLecturers(){
        List<Lecturer> lecturers = appDAO.findLecturers();
        return lecturers;
    }

    @GetMapping("/lecturers/{id}")
    public Lecturer getOneLecturer(@PathVariable int id){
        Lecturer lecturer = appDAO.findLecturerById(id);
        return lecturer;
    }

    // POST methods

    @PostMapping("/add/students")
    public void addStudent(@RequestBody Student student){
        appDAO.addStudent(student);
    }

    @PostMapping("/add/subjects")
    public void addSubject(@RequestBody Subjects subject){
        appDAO.addSubject(subject);
    }

    @PostMapping("/add/lecturer")
    public void addLecturer(@RequestBody Lecturer lecturer){
        appDAO.addLecturer(lecturer);
    }

    // PUT method

    @PutMapping("/update/student")
    public void updateStudent(@RequestBody Student student){
        appDAO.update(student);
    }

    @PutMapping("/update/subject")
    public void updateSubject(@RequestBody Subjects subject){
        appDAO.update(subject);
    }

    @PutMapping("/update/lecturer")
    public void updateLecturer(@RequestBody Lecturer lecturer){
        appDAO.update(lecturer);
    }

    // DELETE method

    @DeleteMapping("/delete/student")
    public void deleteStudent(@RequestBody Student student){
        appDAO.delete(student);
    }

    @DeleteMapping("/delete/subject")
    public void deleteSubject(@RequestBody Subjects subjects){
        appDAO.delete(subjects);
    }

    @DeleteMapping("/delete/lecturer")
    public void deleteLecturer(@RequestBody Lecturer lecturer){
        appDAO.delete(lecturer);
    }
}
