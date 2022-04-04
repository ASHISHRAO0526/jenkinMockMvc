package com.zensar.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRestControllerTest {

	//MockMvc is a class given by spring MVC to perform testing of spring controller.
	@Autowired //to enable autowiring for MockMvc
	private MockMvc mock;
	
	//test class must be annoted with @SpringBootTest and @AutoConfigureMockMvc
	/*@Test
	public void getmessageTest() throws Exception {
		mock
			.perform(MockMvcRequestBuilders.get("/Hello"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Welcome to"));
	}
	*/
	@Test
	public void createMessageTest() throws Exception {
		mock
			.perform(MockMvcRequestBuilders.post("/greet"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Message Created"));
	}
	
	
}
