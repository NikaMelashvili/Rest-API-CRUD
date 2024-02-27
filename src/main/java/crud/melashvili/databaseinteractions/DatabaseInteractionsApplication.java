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
			createSubjects(appDAO);
		};
	}

	private void createSubjects(AppDAO appDAO) {
		Student student = new Student("Nika", "Melashvili", "mela@gmail.com");
		Lecturer lecturer = new Lecturer("Gocha", "Mandaria", 50);
		Lecturer lecturer1 = new Lecturer("Nikoloz", "Katsitadze", 28);
		Subjects subject = new Subjects("Data structures and algorithms");
		Subjects subject1 = new Subjects("Java 2 Spring Boot");
		subject.setLecturer(lecturer);
		subject1.setLecturer(lecturer1);
		student.addSubject(subject);
		student.addSubject(subject1);
		appDAO.addStudent(student);
	}
}
