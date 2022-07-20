package repositories;

import entitiess.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class UserRepository {
    private EntityManager entityManager;

    private RoleRepository roleRepository;


    public UserRepository(EntityManager entityManager, RoleRepository roleRepository) {
        super();
        this.entityManager = entityManager;
        this.roleRepository = roleRepository;

}private static final String USER_BY_USERNAME = "SELECT user FROM UserEntity user where user.firstName =?1 ";


    public List<UserEntity> getAllUsers() {
        TypedQuery<UserEntity> query = entityManager.createNamedQuery("User.findAll", UserEntity.class);
        return query.getResultList();
    }




    public UserEntity getUserByUsername(String username) {
        TypedQuery<UserEntity> query = entityManager.createQuery(USER_BY_USERNAME, UserEntity.class).setParameter(1,username);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void addUser(UserEntity user) {
        entityManager.persist(user);
    }

    public void updateUser(UserEntity user) {
        entityManager.merge(user);
    }


    public void hardDeleteUser(UserEntity user) {
        entityManager.remove(user);
    }
//?
    public void addRoleToUser(String username, Long roleId){
        UserEntity user = getUserByUsername(username);
      //?  RoleEntity role = roleRepository.getRoleById(roleId);
        //?user.getRoles().add(role);
        entityManager.merge(user);
    }}
