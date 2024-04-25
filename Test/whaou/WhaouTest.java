package whaou;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WhaouTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSalut() {
		Whaou whaou=new Whaou();
		assertEquals(whaou.salut(),"Salut");
	}

}
