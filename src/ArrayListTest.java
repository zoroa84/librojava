import java.util.ArrayList;

import junit.framework.TestCase;

public class ArrayListTest extends TestCase {

	static final String FRANCIA = "francia";	
	static final String JAPON   = "japon";
	static final String ITALIA  = "italia";
	static final String NORUEGA = "noreuega";
	
	 public void testPaises() {
		 ArrayList paises = new ArrayList();
		 assertEquals(0, paises.size());
		 
		 paises.add(FRANCIA);
		 assertEquals(1, paises.size());
		 paises.add(JAPON);
		 paises.add(ITALIA);
		 paises.add(NORUEGA);
		 assertEquals(4, paises.size());
		 
		 paises.remove(0);
		 assertEquals(3, paises.size());
		 
		 assertEquals(JAPON, paises.get(0));
		 
	 }
	

}
