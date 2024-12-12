package com.shakaftabahmed;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic2 {
  public static void main(String[] args) {
 var context =new AnnotationConfigApplicationContext(HelloWorldCOnfiguration.class);
  System.out.println(context.getBean("name"));
  System.out.println(context.getBean("age"));
  System.out.println(context.getBean("person"));
  System.out.println(context.getBean("address"));
  }
}
