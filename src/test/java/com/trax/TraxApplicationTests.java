package com.trax;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.trax.repositories.LeadRepository;

@SpringBootTest
class TraxApplicationTests {

	@Autowired
	private LeadRepository leadRepo;
	
	@Test
	void contextLoads() {
		String name = leadRepo.getClass().getName();
		System.out.println(name);
	}

}
