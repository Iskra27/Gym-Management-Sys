package services;

import dto.UserDto;
import entitiess.UserEntity;

import java.util.List;

public interface UserService {

    public UserEntity addUser(UserDto user);
    //public List<UserEntity> getUsers(UserFilter filter);
    public void deleteUser(Long id);
}
