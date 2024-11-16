package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.test.entities.User1;

@SpringBootApplication
public class SpringbootjpaexampleApplication {
 

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootjpaexampleApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class); 
		/*  
		User1 user=new User1(); 
		user.setId(3);
		user.setUserName("Sahjk"); 
		user.setUserPassword("koplp");
		user.setEmail("dddffd@gmail.com");
		//User1 savedUser = userRepository.save(user); 
		//System.out.println(savedUser);
		
		User1 user1=new User1(); 
		user1.setId(4);
		user1.setUserName("dsddd"); 
		user1.setUserPassword("qqqqq");
		user1.setEmail("wwww@gmail.com");
		List<User1> users = List.of(user,user1);
	    Iterable<User1> userList = userRepository.saveAll(users);
	    userList.forEach(user2->{
	    	System.out.println(user2);
	    });
		//System.out.println(savedUser);
	  
		Optional<User1> optional = userRepository.findById(1);
		User1 user = optional.get();
		user.setUserName("GOLOL");
		userRepository.save(user);
		System.out.println(user);
		Iterable<User1> userList = userRepository.findAll();
		userList.forEach(new Consumer<User1>() {
			
			@Override
			public void accept(User1 t) {
				System.out.println(t);
			}
		});
		  
	    userRepository.deleteById(3);		
		List<User1> userlist1=userRepository.findByuserName("GOLOL");
		userlist1.forEach(e->System.out.println(e));
		
		List<User1> userlist1=userRepository.getAlluser();
		userlist1.forEach(e->System.out.println(e));
		
		List<User1> userlist1=userRepository.getUsersByName("GOLOL", 1);
		userlist1.forEach(e->System.out.println(e));
		
		*/
		List<User1> userlist1=userRepository.getUsers();
		userlist1.forEach(e->System.out.println(e));
		
	}

}