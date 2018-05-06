package com.soma.springbootmongodb.config;

import com.soma.springbootmongodb.document.Users;
import com.soma.springbootmongodb.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
public class MondoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                usersRepository.save(new Users(1,"Soma", "Development", 30000L));
                usersRepository.save(new Users(2,"Nellipudi", "Operations", 30000L));
            }
        };
    }
}
