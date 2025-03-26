package net.javaguides.ems;

import net.javaguides.ems.entity.DemoClass;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmsBackendApplication {

	@Bean
	public ModelMapper modelMapper(){
		return  new ModelMapper();
	}

	public static void main(String[] args) {

		SpringApplication.run(EmsBackendApplication.class, args);
		DemoClass demoClass=new DemoClass(
				1L,"shyam"
		);
		System.out.println(demoClass.getName());
	}

}
