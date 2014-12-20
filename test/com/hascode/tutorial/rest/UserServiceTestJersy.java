package com.hascode.tutorial.rest;

import static org.junit.Assert.assertEquals;

import java.net.URISyntaxException;
import javax.ws.rs.core.MediaType;

//import org.codehaus.jettison.json.JSONException;
//import org.codehaus.jettison.json.JSONObject;
import org.json.XML;
import org.junit.Test;

import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

public class UserServiceTestJersy extends JerseyTest {
	@Override
	protected AppDescriptor configure() {
		return new WebAppDescriptor.Builder().build();
	}

	@Test
	public void testUserFetchesSuccess() throws URISyntaxException {
		WebResource webResource = client().resource("http://localhost:8080/");
		String sd = webResource.path("RestAssuredExample/user/id/12").accept(MediaType.APPLICATION_XML).get(
				String.class);
	
		assertEquals(java.lang.Boolean.TRUE, sd.contains("Tim"));
	
	}


}