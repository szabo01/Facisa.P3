package br.cesed.si.exercicio.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.cesed.si.exercicio.Deque;


public class DequeTest {

	@Test
	public void testAddPrimeiroNo1() {
		Deque novoNo = new Deque();
		novoNo.addPrimeiroNo("Robson");
		novoNo.addPrimeiroNo("Alan");
		novoNo.addPrimeiroNo("Matheus");
		assertEquals(3, novoNo.getTamanho());
	}
	
	@Test
	public void testAddPrimeiroNo2(){
		Deque novoNo = new Deque();
		assertEquals(null, novoNo.getPrimeiroNo());
	}
	
	@Test
	public void testAddPrimeiroNo3(){
		Deque novoNo = new Deque();
		
		novoNo.addPrimeiroNo("Robson");
		assertEquals("Robson", novoNo.getPrimeiroNo());
		
	}
	
	@Test
	public void testAddPrimeiroNo4(){
		Deque novoNo = new Deque();
		novoNo.addPrimeiroNo("Robson");
		novoNo.addPrimeiroNo("Galega");
		assertEquals("Galega", novoNo.getPrimeiroNo());
	}
	
	@Test
	public void testRemovePrimeiroNo1() {

		Deque novoNo = new Deque();

		novoNo.addPrimeiroNo("Ayrton");
		novoNo.addPrimeiroNo("Felipe");
		novoNo.addPrimeiroNo("Yago");
		novoNo.addPrimeiroNo("Szabo");
		novoNo.removerPrimeiroNo();

		assertEquals("Yago", novoNo.getPrimeiroNo());

	}
	
	@Test
	public void testRemovePrimeiroNo2() {

		Deque novoNo = new Deque();
		
		novoNo.removerPrimeiroNo();

		assertEquals(null, novoNo.getPrimeiroNo());

	}
	
	@Test (expected = NullPointerException.class)
	public void testRemovePrimeiroNo3() {

		Deque novoNo = new Deque();
		
		novoNo.addPrimeiroNo("Ayrton");
		novoNo.removerPrimeiroNo();

		assertEquals(null, novoNo.getPrimeiroNo());

	}



}
