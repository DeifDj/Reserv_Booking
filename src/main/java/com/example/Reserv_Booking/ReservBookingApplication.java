package com.example.Reserv_Booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "service")
@EnableMongoRepositories(basePackages = "repository")
@ComponentScan(basePackages = "service")
public class ReservBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservBookingApplication.class, args);
	}

}
