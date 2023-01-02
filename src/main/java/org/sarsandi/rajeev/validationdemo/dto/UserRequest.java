package org.sarsandi.rajeev.validationdemo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sarsandi.rajeev.validationdemo.validation.UserValidation;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class UserRequest {
    @NotNull(message = "Username Can not be null")
    @NotEmpty(message = "Username Can not be  Empty")
    String userName;
    @Email(regexp = "^(.+)@(\\S+)$")
    String email;
    @UserValidation
    String nationality;
    @Pattern(regexp = "^\\d{10}$")
    String phoneNo;
}
