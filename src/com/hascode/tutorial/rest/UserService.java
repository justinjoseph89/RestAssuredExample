package com.hascode.tutorial.rest;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserService {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/id/{id}")
	public User findById(@PathParam("id") final String id) {
		System.out.println("adsdcc-" + id);
		
		final User user = new User();
		
		if ("6661".equals(id)) {
			return user;
		}
		user.setId(id);
		user.setFirstName("Tim");
		user.setLastName("Tester");
		// user.setBirthday(new Date(1321009871));
		return user;
	}

	@POST
	@Path("/login/{name}")
	@Produces(MediaType.APPLICATION_XML)
	public User greetName(@PathParam("name") String name) {
		User user = new User();
		user.setName(name);
		System.out.println("Name-------- " + user);

		return user;
	}

}