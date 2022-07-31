package dto;

import entitiess.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MotivationDto {
    private Long id;
    private String MotivationQuote;
    private UserEntity CreatedBy;
}
