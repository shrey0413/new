package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.example.demo.controller.MyCalc2Controller;

@WebMvcTest(MyCalc2Controller.class)
public class WebMockTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private MyCalc2Controller myCalc2Controller;
	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {
		when(myCalc2Controller.homePage()).thenReturn("Please Select the following operations");
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect((ResultMatcher) content().string(containsString("Please Select the following operations")));
	}
}
