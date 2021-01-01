package com.brighttalk.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTestApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) {

        logger.info("Inserting -> {}",
                employeeRepository.insert(
                        new Employee(
                                1,
                                "Mohammad",
                                "Yaseer",
                                "mohammadyaseer@icloud.com",
                                "9731978897"
                        )
                )
        );
        logger.info("Inserting -> {}",
                employeeRepository.insert(
                        new Employee(
                                2,
                                "Hoston",
                                "lindey",
                                "hl@gmail.com",
                                "90908989899")
                )
        );

        logger.info("Inserting -> {}",
                employeeRepository.insert(
                        new Employee(
                                3,
                                "tony",
                                "stark",
                                "stark@gmail.com",
                                "123")
                )
        );

        logger.info("Find id 1 -> {}",
                employeeRepository.findById(1)
        );

        logger.info("Update 2 -> {}",
                employeeRepository.update(
                        new Employee(
                                2,
                                "Jeff",
                                "Bezos",
                                "jeff@amazon.com",
                                "098078")
                )
        );

        employeeRepository.deleteById(3);

        logger.info("All users -> {}", employeeRepository.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaTestApplication.class, args);
    }

}
