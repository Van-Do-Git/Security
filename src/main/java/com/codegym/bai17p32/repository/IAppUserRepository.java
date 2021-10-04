package com.codegym.bai17p32.repository;


import com.codegym.bai17p32.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface IAppUserRepository extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
