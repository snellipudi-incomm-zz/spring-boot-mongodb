package com.soma.springbootmongodb.repository;

import com.soma.springbootmongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<Users, Integer> {
}
