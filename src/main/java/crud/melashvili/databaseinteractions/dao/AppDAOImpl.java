package crud.melashvili.databaseinteractions.dao;

import crud.melashvili.databaseinteractions.entity.Lecturer;
import crud.melashvili.databaseinteractions.entity.Student;
import crud.melashvili.databaseinteractions.entity.Subjects;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.Subject;
import java.util.List;

@Repository
public class AppDAOImpl implements AppDAO{

    private EntityManager manager;

    public AppDAOImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    @Transactional
    public void addStudent(Student student) {
        manager.persist(student);
    }

    @Override
    @Transactional
    public void addSubject(Subjects subject) {
        manager.persist(subject);
    }

    @Override
    @Transactional
    public void addLecturer(Lecturer lecturer) {
        manager.persist(lecturer);
    }

    @Override
    public List<Student> findStudents() {
        String jpql = "select s from Student s";
        TypedQuery<Student> query = manager.createQuery(jpql, Student.class);
        List<Student> studentsList = query.getResultList();
        return studentsList;
    }

    @Override
    public Student findStudentById(int id) {
        Student student = manager.find(Student.class, id);
        return student;
    }

    @Override
    public List<Subjects> findSubjects() {
        String jpql = "select s from Subjects s";
        TypedQuery<Subjects> query = manager.createQuery(jpql, Subjects.class);
        List<Subjects> subjectsList = query.getResultList();
        return subjectsList;
    }

    @Override
    public Subjects findSubjectById(int id) {
        Subjects subject = manager.find(Subjects.class, id);
        return subject;
    }

    @Override
    public List<Lecturer> findLecturers() {
        String jpql = "select l from Lecturer l";
        TypedQuery<Lecturer> query = manager.createQuery(jpql, Lecturer.class);
        List<Lecturer> lecturerList = query.getResultList();
        return lecturerList;
    }

    @Override
    public Lecturer findLecturerById(int id) {
        Lecturer lecturer = manager.find(Lecturer.class, id);
        return lecturer;
    }

    // update

    @Override
    @Transactional
    public void update(Student student) {
        manager.merge(student);
    }

    @Override
    @Transactional
    public void updateStudentById(int id) {
        Student student = manager.find(Student.class, id);
        manager.merge(student);
    }

    @Override
    @Transactional
    public void update(Subjects subjects) {
        manager.merge(subjects);
    }

    @Override
    @Transactional
    public void updateSubjectById(int id) {
        Subjects subjects = manager.find(Subjects.class, id);
        manager.merge(subjects);
    }

    @Override
    @Transactional
    public void update(Lecturer lecturer) {
        manager.merge(lecturer);
    }

    @Override
    @Transactional
    public void updateLecturerById(int id) {
        Lecturer lecturer = manager.find(Lecturer.class, id);
        manager.merge(lecturer);
    }

    // delete

    @Override
    @Transactional
    public void delete(Student student) {
        manager.remove(student);
    }

    @Override
    @Transactional
    public void deleteStudentById(int id) {
        Student student = manager.find(Student.class, id);
        manager.remove(student);
    }

    @Override
    @Transactional
    public void delete(Subjects subject) {
        manager.remove(subject);
    }

    @Override
    @Transactional
    public void deleteSubjectById(int id) {
        Subjects subjects = manager.find(Subjects.class, id);
        manager.remove(subjects);
    }

    @Override
    @Transactional
    public void delete(Lecturer lecturer) {
        manager.remove(lecturer);
    }

    @Override
    @Transactional
    public void deleteLecturerById(int id) {
        Lecturer lecturer = manager.find(Lecturer.class, id);
        manager.remove(lecturer);
    }
}
