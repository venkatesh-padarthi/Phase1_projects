package com.ecommerce.test.Junitexample;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Standard Test Class Example")
public class StandardTestClass1 {

   @BeforeAll
    static void initAll() {
        System.out.println("initAll()");
    }

    @BeforeEach
    void init() {
        System.out.println("init()");

    }
    

    @Test
    void succeedingTest() {
        System.out.println("succeedingTest()");

    }

    @Test
    void failingTest() {
        System.out.println("failingTest()");

        fail("a failing test");
    }

    private void fail(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        System.out.println("abortedTest()");

        assertTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown()");

    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll()");

    }

}
