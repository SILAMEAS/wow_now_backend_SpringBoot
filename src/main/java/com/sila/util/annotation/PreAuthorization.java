package com.sila.util.annotation;

import com.sila.util.enums.USER_ROLE;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PreAuthorization {
    USER_ROLE[] value(); // Accepts enum values now
}
