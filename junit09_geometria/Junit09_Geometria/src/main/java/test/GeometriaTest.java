package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.App;
import JUnit.Junit09_Geometria.dto.Geometria;

class GeografiaTest {
	
	Geometria geo;
	App main = new App();

	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
		geo.clear();
	}
	
	@Test
	void testGeometria() {
		Geometria expected = new Geometria();
		Geometria actual = this.geo;
		assertEquals(expected.getClass(),actual.getClass());
	}
	
	@Test
	void testGeometria2() {
		int expected = 3;
		Geometria actual = new Geometria(3);
		assertEquals(expected,actual.getId());
	}
	
	@Test
	void testAreaCuadrado() {
		assertEquals(9,geo.areacuadrado(3));
	}
	
	@Test
	void testAreaCirculo() {
		assertEquals(12,geo.areaCirculo(2),1);
	}
	
	@Test
	void testAreaTriangulo() {
		assertEquals(3,geo.areatriangulo(2,3));
	}
	
	@Test
	void testAreaPentagono() {
		assertEquals(3,geo.areapentagono(2,3),1);
	}
	
	@Test
	void testAreaRectangulo() {
		assertEquals(6,geo.arearectangulo(2,3),1);
	}
	
	@Test
	void testAreaRombo() {
		assertEquals(3,geo.arearombo(2,3),1);
	}
	
	@Test
	void testAreaRomboide() {
		assertEquals(6,geo.arearomboide(2,3),1);
	}
	
	@Test
	void testAreaTrapecio() {
		assertEquals(20,geo.areatrapecio(7,3,4),1);
	}
	
	@Test
	void testFigura1() {
		String s = "cuadrado";
		geo.setNom(s);
		assertEquals(s,geo.figura(1));
	}
	
	@Test
	void testFigura2() {
		String s = "Circulo";
		geo.setNom(s);
		assertEquals(s,geo.figura(2));
	}
	
	@Test
	void testFigura3() {
		String s = "Triangulo";
		geo.setNom(s);
		assertEquals(s,geo.figura(3));
	}
	
	@Test
	void testFigura4() {
		String s = "Rectangulo";
		geo.setNom(s);
		assertEquals(s,geo.figura(4));
	}
	
	@Test
	void testFigura5() {
		String s = "Pentagono";
		geo.setNom(s);
		assertEquals(s,geo.figura(5));
	}
	
	@Test
	void testFigura6() {
		String s = "Rombo";
		geo.setNom(s);
		assertEquals(s,geo.figura(6));
	}
	
	@Test
	void testFigura7() {
		String s = "Romboide";
		geo.setNom(s);
		assertEquals(s,geo.figura(7));
	}
	
	@Test
	void testFigura8() {
		String s = "Trapecio";
		geo.setNom(s);
		assertEquals(s,geo.figura(8));
	}
	
	@Test
	void testFigura0() {
		String s = "Default";
		geo.setNom(s);
		assertEquals(s,geo.figura(0));
	}
	
	@Test
	void testsetid() {
		geo.setId(5);
		assertEquals(5,geo.getId());
	}
	
	@Test
	void testgetnom() {
		geo.setNom("cuadrado");
		assertEquals("cuadrado",geo.getNom());
	}
	
	@Test
	void testarea() {
		geo.setArea(20);
		assertEquals(20,geo.getArea());
	}
	
	@Test
	void testtostring() {
		geo.setId(5);
		geo.setNom("cuadrado");
		geo.setArea(25);
		assertEquals("Geometria [id=" + 5 + ", nom=" + "cuadrado" + ", area=" + 25.0 + "]",geo.toString());
	}
	
	void main() {
		main= new App();
		main.main(null);
	}
	
	
	
	
	

}
