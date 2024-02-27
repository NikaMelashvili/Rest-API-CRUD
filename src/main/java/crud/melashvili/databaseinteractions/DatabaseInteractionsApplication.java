package crud.melashvili.databaseinteractions;

import crud.melashvili.databaseinteractions.dao.AppDAO;
import crud.melashvili.databaseinteractions.entity.Lecturer;
import crud.melashvili.databaseinteractions.entity.Student;
import crud.melashvili.databaseinteractions.entity.Subjects;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DatabaseInteractionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseInteractionsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
//			insertSubjectAndStudentAndLecturer(appDAO);
//			createAndSaveAll(appDAO);
//			createStudent(appDAO);
			createSubjects(appDAO);
		};
	}

	private void createSubjects(AppDAO appDAO) {
		Student student = new Student("Nika", "Melashvili", "mela@gmail.com");
		Subjects subject = new Subjects("Data structures and algorithms");
		student.addSubject(subject);
		appDAO.addStudent(student);
	}

	private void createAndSaveAll(AppDAO appDAO) {
		Student student = new Student("Nika", "Melashvili", "mela@gmail.com");
		Subjects subject = new Subjects("Data structures and algorithms");
		Lecturer lecturer = new Lecturer("Gocha", "Mandaria", 50);
		subject.setLecturer(lecturer);
		appDAO.addSubject(subject);
		System.out.println(subject);
		System.out.println(subject.getLecturer());
	}
}
