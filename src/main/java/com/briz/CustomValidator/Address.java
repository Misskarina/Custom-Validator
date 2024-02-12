package com.briz.CustomValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target( { ElementType.METHOD,ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=AddressValidator.class)
public @interface Address {
	
	public String message() default "You address must contains india";
	 
    public Class<?>[] groups() default {}; 
    public Class<? extends Payload>[] payload() default {}; 


}
