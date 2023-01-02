package org.sarsandi.rajeev.validationdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class UserRequestValidation implements ConstraintValidator<UserValidation, String> {
  @Override
  public boolean isValid(
      String nationality, ConstraintValidatorContext constraintValidatorContext) {
    List<String> national = Arrays.asList("E", "I");

    return national.contains(nationality);
  }
}
