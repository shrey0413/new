package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class TestApp {

    private MockMvc mvc;

	@Test
	public void accessUnsecuredResourceThenOk() throws Exception {
		mvc.perform(get("/"))
			.andExpect(status().isOk());
	}
    }




