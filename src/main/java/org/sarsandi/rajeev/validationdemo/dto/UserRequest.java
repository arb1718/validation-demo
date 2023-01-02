package org.sarsandi.rajeev.validationdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sarsandi.rajeev.validationdemo.validation.UserValidation;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
