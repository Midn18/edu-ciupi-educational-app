package com.educiupi.educiupiapp.service;

import com.educiupi.educiupiapp.ciupiDTOs.UserDto;
import com.educiupi.educiupiapp.entities.UserEntity;
import com.educiupi.educiupiapp.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllData() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public UserEntity post(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setAge(userDto.getAge());
        return userRepository.save(userEntity);
    }
}
