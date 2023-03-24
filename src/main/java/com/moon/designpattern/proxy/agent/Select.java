package com.moon.designpattern.proxy.agent;

import java.lang.annotation.*;

/**
 * @author Chanmoey
 * @date 2023年03月24日
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    String value() default "";

}
