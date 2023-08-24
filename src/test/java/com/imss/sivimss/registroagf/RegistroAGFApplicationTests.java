package com.imss.sivimss.registroagf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.imss.sivimss.registroagf.RegistroAGFApplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RegistroAGFApplicationTests {

	@Test
	void contextLoads() {
		String result="test";
		RegistroAGFApplication.main(new String[]{});
		assertNotNull(result);
	}

}
