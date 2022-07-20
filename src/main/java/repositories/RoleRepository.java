package repositories;

import entitiess.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Transactional
@Repository
public class RoleRepository {
    @Autowired
    private EntityManager entityManager;

    public void addRole(RoleEntity role) {
        entityManager.persist(role);
    }

    public RoleEntity getRoleById(Long id) {
        return entityManager.createNamedQuery("Role.findById", RoleEntity.class).setParameter(1, id).getSingleResult();
}}
