package com.christophe.marchal.classpathscanner.metadata.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to tag classes containing XmlMapping information
 * @author Christophe Marchal
 *
 */

@Retention(RetentionPolicy.RUNTIME) // Make this annotation accessible at runtime via reflection.
@Target({ElementType.TYPE})       // This annotation can only be applied to a class.
public @interface XmlMapping {}
