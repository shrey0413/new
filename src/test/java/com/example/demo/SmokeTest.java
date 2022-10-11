package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.MyCalc2Controller;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private MyCalc2Controller myCalc2Controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(myCalc2Controller).isNotNull();
	}
	@Test 
	public void addTest()
	{
		assertThat(myCalc2Controller.addPage()).isNotNull();
	}
	@Test
	public void subTest()
	{
		assertThat(myCalc2Controller.subtract()).isNotNull();
	}
	@Test
	public void mulTest()
	{
		assertThat(myCalc2Controller.multiply()).isNotNull();
	}
	@Test
	public void divTest()
	{
		assertThat(myCalc2Controller.divide()).isNotNull();
	}
	
}
