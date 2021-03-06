package es.unican.is2.gestionTienda;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VendedorEnPracticasTest {
	
	private static Vendedor sut;

	@Before
	public void setUp(){
		sut = new vendedorEnPracticas("Ana", "1", "11111111A");
	}
	
	@Test
	public void testConstructor() {
		assertEquals(sut.getId(), "1");
		assertEquals(sut.getNombre(), "Ana");
		assertEquals(sut.getDni(), "11111111A");
		assertTrue(sut.getTotalVentas()==0.0);
	}
	
	@Test
	public void testSetTotalVentas() {
		sut.setVentasVendedor(100);
		assertTrue(sut.getTotalVentas()==100.0);
		
		sut.setVentasVendedor(230);
		assertTrue(sut.getTotalVentas()==230.0);
		
		sut.setVentasVendedor(0);
		assertTrue(sut.getTotalVentas()==0.0);
	}

	@Test
	public void testAnhadeVenta() {
		sut.anhadeVentaVendedor(200);
		assertTrue(sut.getTotalVentas() == 200.0);
		
		sut.anhadeVentaVendedor(300);
		assertTrue(sut.getTotalVentas() == 500.0);	
		
		sut.anhadeVentaVendedor(0);
		assertTrue(sut.getTotalVentas() == 500.0);
		
		
	}
	
	@Test
	public void testEquals() {
		Vendedor igual = new vendedorEnPracticas("Ana", "1", "11111111A");
		Vendedor distintoId = new vendedorEnPracticas("Ana", "2", "11111111A");
		Vendedor distintoNombre = new vendedorEnPracticas("Pepe", "1", "222222222A");
		
		assertTrue(sut.equals(igual));
		assertFalse(sut.equals(distintoId));
		assertFalse(sut.equals(distintoNombre));
	}
	
	
	
}
