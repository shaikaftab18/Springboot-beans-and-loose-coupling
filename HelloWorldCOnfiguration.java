package com.shakaftabahmed;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name,int age) {
	
};
record Address(String firstline,String City) {
	
}
@Configuration
public class HelloWorldCOnfiguration {
 @Bean
 public String name() {
	 return "Aftab";
 }
 @Bean
 public int age() {
	 return 21;
	 
 }
 @Bean
 public Person person() {
	 return new Person("Aftab2",22);
 }
 @Bean
	 public Address address() {
		 return new Address("1st street","hyd");
	 }
 
}
