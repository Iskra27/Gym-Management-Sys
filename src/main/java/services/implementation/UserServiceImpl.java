package services.implementation;

import converter.UserConverter;
import dto.ResponseTestExternalAPI;
import dto.UserDto;
import dto.UserFilter;
import entitiess.UserEntity;
import exceptions.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import repositories.MembershipInfoRepository;
import repositories.RoleRepository;
import repositories.UserRepository;
import services.UserService;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    MembershipInfoRepository membershipInfoRepository;
    private String URL = "https://jsonplaceholder.typicode.com/todos/1";
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public UserEntity addUser(UserDto user) {
        logger.info("Adding user {}", user);
        if (user != null) {
            UserEntity addedUser = UserConverter.toEntity(user);
            userRepository.addUser(addedUser);
            logger.info("User added");
            return addedUser;}
        else
        { logger.warn("Something went wrong");}

        return null;
    }

    @Override
    public List<UserEntity> getUsers(UserFilter filter) {
        logger.info("Filtring users with filter {}", filter);
        return userRepository.getAllUsers(filter);
    }

    @Override
    public void deleteUser(Long id) {
        UserEntity user=userRepository.getUserById(id);
        if (user!=null){
            userRepository.DeleteUser(user);


        }else {
            logger.warn("User not found");
            throw new UserException(id);
        }

    }

    @Override
    public UserEntity getUserById(Long id) {
        UserEntity user=userRepository.getUserById(id);
        if(user!=null){
            logger.info("User found!");
        } else {
        logger.warn("User not found");
        throw new UserException(id);
    }
        return user;
    }


    @Override
    public void testRest() {

        ResponseEntity<ResponseTestExternalAPI> response = restTemplate.exchange(URL, HttpMethod.GET, null,
                ResponseTestExternalAPI.class);

        ResponseTestExternalAPI a = response.getBody();

        System.out.println(a);
    }
}
