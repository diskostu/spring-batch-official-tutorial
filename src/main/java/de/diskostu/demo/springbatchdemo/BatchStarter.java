package de.diskostu.demo.springbatchdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchStarter {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(
                SpringApplication.run(BatchStarter.class, args)));
    }
}
