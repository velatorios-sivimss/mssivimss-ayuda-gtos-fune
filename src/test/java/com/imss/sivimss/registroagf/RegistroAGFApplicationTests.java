package com.imss.sivimss.registroagf;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class RegistroAGFApplicationTests {

	
	void contextLoads() {
		String result="test";
		RegistroAGFApplication.main(new String[]{});
		assertNotNull(result);
	}

}
