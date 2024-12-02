package com.ecommerce.common.order.validation;

import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.ConstraintValidator;

public class OrderAmountValidator implements ConstraintValidator<ValidOrderAmount, Integer>
{
    private int min;
    private int max;

    @Override
    public void initialize(ValidOrderAmount constraintAnnotation)
    {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context)
    {
        return value != null && value >= min && value <= max;
    }
}