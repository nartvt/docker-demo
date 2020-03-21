package com.example.demo;

import java.util.List;

public interface UserService {
  
  List<UserDTO> findAll();
  
  UserDTO save(UserDTO userDTO);
}
