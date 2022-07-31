package entitiess;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@ToString
@Entity
@Table(name = "role", schema = "public")
@NamedQuery(name="Role.findById", query = "Select role from RoleEntity role where role.id=?1")
public class RoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name="role_type")
    private String Role;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
    @OneToMany(mappedBy = "role")
    List<UserEntity> userEntityList=new ArrayList<>();
}
