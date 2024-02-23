package crud.melashvili.databaseinteractions;

import crud.melashvili.databaseinteractions.dao.AppDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseInteractionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseInteractionsApplication.class, args);
	}

}
