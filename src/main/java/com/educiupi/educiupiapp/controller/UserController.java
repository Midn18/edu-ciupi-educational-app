package com.educiupi.educiupiapp.controller;


import com.educiupi.educiupiapp.ciupiDTOs.UserDto;
import com.educiupi.educiupiapp.entities.UserEntity;
import com.educiupi.educiupiapp.service.UserService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ciupi")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public ResponseEntity<List<UserEntity>> getAll() {
        return new ResponseEntity<>(userService.getAllData(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public Optional<UserEntity> getById(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> create(@RequestBody UserDto userDto) {
        UserEntity swagEntity = userService.post(userDto);
        return new ResponseEntity<>(swagEntity, HttpStatus.CREATED);
    }

//	@PutMapping("/update/{id}")
//	public ResponseEntity<SwaggerEntity> update(@PathVariable Integer id, @RequestBody SwaggerDTO swagDto) {
//		SwaggerEntity swagEntity = swagService.put(id, swagDto);
//		if (swagEntity != null) {
//			return ResponseEntity.ok(swagEntity);
//		} else {
//			return ResponseEntity.notFound().build();
//		}
//
//	}
//
//	@PatchMapping("/patch/{id}")
//	public ResponseEntity<SwaggerEntity> patch(@PathVariable Integer id, @RequestBody SwaggerDTO swagDto) {
//		SwaggerEntity swagEntity = swagService.patch(id, swagDto);
//		if (swagEntity != null) {
//			return ResponseEntity.ok(swagEntity);
//		} else {
//			return ResponseEntity.notFound().build();
//		}
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<Void> delete(@PathVariable Integer id){
//		boolean removed = swagService.deleteRecord(id);
//		if(removed) {
//			return ResponseEntity.noContent().build();
//		}else {
//			return ResponseEntity.notFound().build();
//		}
//	}
//
//	@PostMapping("/signup")
//	public ResponseEntity<LoginRegister> signup(@RequestBody SwaggerDTO register){
//		LoginRegister signUp = swagService.createUser(register);
//		return new ResponseEntity<>(signUp, HttpStatus.CREATED);
//	}
//
//	@PostMapping("/login")
//	public ResponseEntity<String> login(@RequestBody SwaggerDTO signIn){
//		if(swagService.checkLogin(signIn.getEmail(), signIn.getPassword())) {
//			 return ResponseEntity.ok("Login successful");
//		}else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//	}

}
