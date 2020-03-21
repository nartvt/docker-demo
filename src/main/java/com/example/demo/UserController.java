package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserController {

  @Autowired
  private UserService userService;
  
  @GetMapping("/all")
  public List<UserDTO> getAll(){
    System.out.println("Start Get All Data");
    return userService.findAll();
  }
  
  @PostMapping("/save")
  public UserDTO save(@RequestBody UserDTO userDTO) {
    System.out.println("Save a record");
    return userService.save(userDTO);
  }
}
