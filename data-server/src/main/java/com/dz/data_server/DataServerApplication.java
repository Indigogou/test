package com.dz.data_server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

@SpringBootApplication
public class DataServerApplication {

	public static void main(String[] args) throws IOException {
		Date dt = new Date();
		System.out.println("The current local time is: " + dt.getTime());
		SpringApplication.run(DataServerApplication.class, args);
	}

}
