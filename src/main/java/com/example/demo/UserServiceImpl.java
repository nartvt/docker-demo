package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRespository userRepository;
  
  @Override
  public List<UserDTO> findAll() {
      List<UserEntity>  userEntities =  userRepository.findAll();
      
      List<UserDTO> userDTOs = new ArrayList<UserDTO>();
      
      userEntities.forEach(obj->{
        UserDTO dto = new UserDTO();
        dto.setId(obj.getId());
        dto.setName(obj.getName());
        dto.setAge(obj.getAge());
        userDTOs.add(dto);
      });
      return userDTOs;
  }

  @Override
  public UserDTO save(UserDTO userDTO) {
    UserEntity userEntity = new  UserEntity();
    userEntity.setName(userDTO.getName());
    userEntity.setAge(userDTO.getAge());
    
    UserEntity userTemp =  this.userRepository.save(userEntity);
    
    UserDTO dto = new UserDTO();
    dto.setId(userTemp.getId());
    dto.setName(userTemp.getName());
    dto.setAge(userTemp.getAge());
    
    return dto;
  }

}
