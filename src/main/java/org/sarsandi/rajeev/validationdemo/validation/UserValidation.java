package org.sarsandi.rajeev.validationdemo.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Documented
@Constraint(validatedBy = UserRequestValidation.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserValidation {

    String message() default "Nationality should be either E or I";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
