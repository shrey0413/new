package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.example.demo.bean.Numbers;
import com.example.demo.controller.MyCalc2Controller;

public class TestCalculator {
	 private final MyCalc2Controller calculator = new MyCalc2Controller();

	    @Test
	    void addition() {
	        assertEquals(2, calculator.add(1, 1));
	    }
	}

