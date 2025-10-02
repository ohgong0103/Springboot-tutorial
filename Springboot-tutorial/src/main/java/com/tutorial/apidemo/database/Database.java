package com.tutorial.apidemo.database;

import com.tutorial.apidemo.models.Product;
import com.tutorial.apidemo.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
@Bean
CommandLineRunner initDatabase (ProductRepository productRepository){

    {

        return new  CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA= new Product("Macbook",2020,2400,"");
                Product productB= new Product("Macbook2",2020,2400,"");
                logger.info("insert data"+productRepository.save(productA));
                logger.info("insert data"+productRepository.save(productB));


            }
        };
    }

}

}
