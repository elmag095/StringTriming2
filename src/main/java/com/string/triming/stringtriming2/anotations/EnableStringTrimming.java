package com.string.triming.stringtriming2.anotations;

import com.string.triming.stringtriming2.configs.StringTrimmingConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(StringTrimmingConfiguration.class)
public @interface EnableStringTrimming {
}
