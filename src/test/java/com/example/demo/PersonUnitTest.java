package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PersonUnitTest {

	@Test
	public void givenUnmanagedObjects_whenInjectingIdService_thenIdValueIsCorrectlySet() {

		PersonEntity personEntity = new PersonEntity("Baeldung");
		assertEquals(1, personEntity.getId());
		assertEquals("Baeldung", personEntity.getName());
	}
}
