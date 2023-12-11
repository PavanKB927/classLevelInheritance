package com.example.classlevelineritance;

import com.example.classlevelineritance.joinedtable.Student;
import com.example.classlevelineritance.joinedtable.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassLevelInheritanceApplication implements CommandLineRunner {

	private final StudentRepository studentRepository;

	public ClassLevelInheritanceApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ClassLevelInheritanceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
		student.setName("Pavan");
		student.setEmail("Pavan@gmail.com");
		student.setPsp(90.04);
		studentRepository.save(student);

	}
}
