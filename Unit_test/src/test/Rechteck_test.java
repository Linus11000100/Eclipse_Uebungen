package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import package1.Rechteck;

class Rechteck_test {

	@Test
	void test() {
		
		Rechteck myRechteck = new Rechteck(10,20); // Auf die Klasse zugreifen.
		
		assertTrue(60==myRechteck.brechneUmfang()); // Überprüfung der Methoden berechnung.
		
		
		//fail("Not yet implemented");
	}

}
