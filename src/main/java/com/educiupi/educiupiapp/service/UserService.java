package com.educiupi.educiupiapp.service;

import com.educiupi.educiupiapp.ciupiDTOs.UserDto;
import com.educiupi.educiupiapp.entities.UserEntity;
import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<UserEntity> getAllData();

    public Optional<UserEntity> getById(Integer id);

    public UserEntity post(UserDto userDto);

//    public UserEntity put(Integer id, SwaggerDTO swagDto);
//
//    public UserEntity patch(Integer id, SwaggerDTO swagDto);

//    public boolean deleteRecord(Integer id);
//
//    public LoginRegister createUser(SwaggerDTO register);
//
//    public boolean checkLogin(String email, String password);
}
