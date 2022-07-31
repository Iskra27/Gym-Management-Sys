package services;

import dto.UserDto;
import dto.UserFilter;
import entitiess.UserEntity;

import java.util.List;

public interface UserService {

    public UserEntity addUser(UserDto user);

    List<UserEntity> getUsers(UserFilter filter);

    public void deleteUser(Long id);
    public UserEntity getUserById(Long id);



    void testRest();
}
