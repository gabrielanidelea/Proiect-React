package ro.tuc.react2023.dtos;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import ro.tuc.react2023.entities.User;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO  {

    private UUID id_user;
    @NotNull
    private String username;
    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    private User.ROLE role;

}
