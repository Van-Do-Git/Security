package com.codegym.bai17p32.service;


import com.codegym.bai17p32.model.AppUser;

public interface IAppUserService extends IGeneralService<AppUser> {
    AppUser getUserByUsername(String username);

    AppUser getCurrentUser();
}
