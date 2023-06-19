package com.devsuperior.orderComponentsDependencyChallenge;

import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class OrderComponentsDependencyChallengeApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(OrderComponentsDependencyChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}
}
