package ro.tuc.react2023.dtos.validators;/*package ro.tuc.react2023.dtos.validators;

import org.springframework.stereotype.Component;
import ro.tuc.react2023.dtos.validators.annotation.AgeLimit;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class AgeValidator implements ConstraintValidator<AgeLimit, Integer> {

    private int ageLimit;

    @Override
    public void initialize(AgeLimit constraintAnnotation) {
        this.ageLimit = constraintAnnotation.limit();
    }

    @Override
    public boolean isValid(Integer inputAge, ConstraintValidatorContext constraintValidatorContext) {
        return inputAge > ageLimit;
    }


}
*/