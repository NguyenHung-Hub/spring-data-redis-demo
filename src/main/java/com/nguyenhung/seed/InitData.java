package com.nguyenhung.seed;

import com.nguyenhung.entity.Product;
import com.nguyenhung.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitData {

    @Bean
    CommandLineRunner fakeData(ProductRepo productRepo){
        return  new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                productRepo.save(new Product(1,"iPhone 11", 10, 1200));
//                productRepo.save(new Product(2,"iPhone 12", 40, 1200));
//                productRepo.save(new Product(3,"iPhone 13", 100, 1300));
//                productRepo.save(new Product(4,"iPhone 14", 200, 1200));
            }
        };
    }
}
