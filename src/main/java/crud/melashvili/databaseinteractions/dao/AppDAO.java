package crud.melashvili.databaseinteractions.dao;


import crud.melashvili.databaseinteractions.entity.Lecturer;
import crud.melashvili.databaseinteractions.entity.Student;
import crud.melashvili.databaseinteractions.entity.Subjects;

import java.util.List;

public interface AppDAO {

    // create
    void addStudent(Student student);

    void addSubject(Subjects subject);

    void addLecturer(Lecturer lecturer);

    // read

    List<Student> findStudents();

    Student findStudentById(int id);

    List<Subjects> findSubjects();

    Subjects findSubjectById(int id);

    List<Lecturer> findLecturers();

    Lecturer findLecturerById(int id);

    // update

    void update(Student student);

    void updateStudentById(int id);

    void update(Subjects subjects);

    void updateSubjectById(int id);

    void update(Lecturer lecturer);

    void updateLecturerById(int id);

    // delete

    void delete(Student student);

    void deleteStudentById(int id);

    void delete(Subjects subject);

    void deleteSubjectById(int id);

    void delete(Lecturer lecturer);

    void deleteLecturerById(int id);
}
