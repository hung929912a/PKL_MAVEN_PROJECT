package mvcpkl.dao;

import mvcpkl.dto.UserDTO;
import mvcpkl.entities.UserEntity;

import java.util.List;

public interface AccountDAO {
    void addUser(UserDTO userDTO);
    List<UserEntity> getAllUser();
    UserDTO getUserByUserName(String username);
    void deleteUser(int id);
    String regisAccount(UserEntity userEntity);
    void editRole(int user_id, int[] role_id);
}
