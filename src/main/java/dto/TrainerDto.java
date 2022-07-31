package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TrainerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private int role;
}
