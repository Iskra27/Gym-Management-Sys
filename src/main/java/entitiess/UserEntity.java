package entitiess;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@ToString
@Entity
@Table(name="user",schema="public")
@NamedQuery(name = "User.findAll", query = "SELECT user FROM UserEntity user ")


public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name="name")
    private String firstName;
    @Column(nullable = false,name="surname")
    private String lastName;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private int role ;
    @Column(nullable = false,name="membership_id")
    private int membershipId ;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @ManyToOne
    @JoinColumn(name="trainer_relations", referencedColumnName="user_id")
    private TrainerRelEntity trainerRelEntity;

    @ManyToOne
    @JoinColumn(name="role",referencedColumnName = "role_id")
    private RoleEntity roleEntity;
    @ManyToOne
    @JoinColumn(name="check_in",referencedColumnName = "id")
    private CheckInEntity checkInEntity;


}
