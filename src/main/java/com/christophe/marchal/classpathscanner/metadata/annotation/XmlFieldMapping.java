package com.christophe.marchal.classpathscanner.metadata.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Make this annotation accessible at runtime via reflection.
@Target({ElementType.FIELD})       // This annotation can only be applied to class field.
public @interface XmlFieldMapping {

	String xmlField() default "";
}
