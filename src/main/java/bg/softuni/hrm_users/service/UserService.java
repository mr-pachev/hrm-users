package bg.softuni.hrm_users.service;


import bg.softuni.hrm_users.model.dto.AddUserDTO;
import bg.softuni.hrm_users.model.dto.UserDTO;
import bg.softuni.hrm_users.model.entity.User;

import java.util.List;

public interface UserService {
    boolean addUser(AddUserDTO addUserDTO);
    UserDTO getUserById(long id);
    void deleteUser(long id);
    List<UserDTO> getAllUsers();
}