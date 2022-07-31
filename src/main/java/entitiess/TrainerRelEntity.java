package entitiess;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="trainer_relations",schema = "public")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TrainerRelEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,name="user_id")
    private String user;
    @Column(nullable = false,name="trainer_id")
    private String trainer;
}
