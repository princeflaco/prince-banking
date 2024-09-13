package com.github.princeflaco.princebanking;

import org.springframework.boot.SpringApplication;

public class TestPrinceBankingApplication {

    public static void main(String[] args) {
        SpringApplication.from(PrinceBankingApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
