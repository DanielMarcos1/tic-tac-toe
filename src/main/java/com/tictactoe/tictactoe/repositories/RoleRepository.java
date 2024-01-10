package com.tictactoe.tictactoe.repositories;

import com.tictactoe.tictactoe.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {}
