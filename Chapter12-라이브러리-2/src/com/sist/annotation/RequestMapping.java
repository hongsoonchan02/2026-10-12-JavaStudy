package com.sist.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
// 메소드위에 => 
public @interface RequestMapping {
   public String value(); //@RequestMapping("1")
   //public int val(); // @RequestMapping(1)
}