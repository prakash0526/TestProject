package com.exp.TestProject;

import com.exp.TestProject.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);

		TestProjectApplication ts = new TestProjectApplication();
		TestProjectApplication.getProductsList();
	}

	private static void getProductsList() {
		Product product1 = new Product();
		Product product2 = new Product();

		product1.setCategory("Books");
		product1.setPrice(102);

		product2.setCategory("pens");
		product2.setPrice(30);

		List<Product> productList = Arrays.asList(product1,product2).stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());

		System.out.println(productList);
		System.out.println("Hello its a Test project for testing");
	}

}
