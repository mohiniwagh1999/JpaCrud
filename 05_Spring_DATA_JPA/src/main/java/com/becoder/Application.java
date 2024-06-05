package com.becoder;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.becoder.entities.Student;
import com.becoder.repository.StudentRepo;

@SpringBootApplication


@EnableJpaRepositories("com.becoder.repository")
@EntityScan("com.becoder.entities")
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		 StudentRepo stRepo =context.getBean(StudentRepo.class);
		 
		 Student st=new Student();
		 st.setName("mohini");
		 st.setCity("mumbai");
	 st.setStatus("programmer");
		 //stRepo.save(st);
		 
		 //List<Student> list=(List<Student>) stRepo.findAll();
		 //list.forEach(student-> System.out.println(student));
	Student st=stRepo.findById(2).get();
		System.out.println(st);
	st.setName("anand");
	st.setCity("aurangabad");	
	st.setStatus("lower");
	stRepo.save(st);
		System.out.println("data updated");
		
		 Student st=stRepo.findById(1).get();
		System.out.println(st);
		stRepo.delete(st);
		System.out.println("delete successfully");
	}

}
