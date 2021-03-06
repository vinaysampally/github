package com.sample;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;  

@Path("/UserService") 
public class UserService {  
   @GET 
   @Path("/users") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<User> getUsers(){ 
	   User user = new User(1, "Mahesh", "Teacher"); 
	   List<User> userList = new ArrayList<User>(); 
       userList.add(user); 
      return userList; 
   }  
   
   @GET 
   @Path("/user/{id}") 
   @Produces(MediaType.APPLICATION_XML) 
   public User getUser(@PathParam("id") String userID) { 
	   System.out.println("userID"+userID);
	   User user = new User(1, "vinay", "viany2"); 
      return user; 
   } 
}