package com.abdul.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

//vi application.properties    for external file [outside .jar file]
// java -jar target/config.demo-0.0.1-SNAPSHOT.jar
//java -jar target/config.demo-0.0.1-SNAPSHOT.jar   --my.greeting=hello from command line
