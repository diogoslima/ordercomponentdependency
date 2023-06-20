package com.devsuperior.orderComponentsDependencyChallenge;

import com.devsuperior.entities.Order;
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
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println("Dados do Pedido");
		System.out.print("Código: ");
		int code = input.nextInt();
		System.out.print("Preço: ");
		double basic = input.nextDouble();
		System.out.print("Desconto: ");
		double discount = input.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println();
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));

	}
}
