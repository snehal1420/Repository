package com.spboot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class JunitTestStudent extends JUnitWithSpringBootApplicationTests
{
	@Autowired
	private WebApplicationContext webApplicationContext;
	private MockMvc mockMvc;

	@Test
	public void TestgetData() throws Exception
	{
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
		mockMvc.perform(get("/getdata")).andExpect(status().isOk()).
		andExpect(content().contentType("application/json")).
		andExpect(jsonPath("$.sid").value("1")).andExpect(jsonPath("$.sname").value("snehal")).
		andExpect(jsonPath("$.saddr").value("Pune"));
	}
	
	
	
}
