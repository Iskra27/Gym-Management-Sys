package dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    @NotBlank(message="First name is mandatory")
    private String lastName;
    @NotBlank(message="Last name is mandatory")
    private int age;
    @NotBlank(message="Age is mandatory")
    private int role;
    private String gender;
    private int membershipId;
    private int trainer;
}
