package br.cesed.si.p3.deque;

import static org.junit.Assert.*;

import org.junit.Test;



public class DequeTest {

	@Test
	public void inserirInicioTest() {	
		Deque<String> deque = new Deque<>();
		deque.inserirInicio("a");
		deque.inserirInicio("b");
		assertEquals(2, deque.tamanho());
	}
	
	@Test
	public void inserirInicioFim() {	
		Deque<String> deque = new Deque<>();
		deque.inserirInicio("a");
		deque.inserirInicio("b");
		assertEquals(2, deque.tamanho());
	}
	
	@Test
	public void removeFim() {	
		Deque<String> deque = new Deque<>();
		deque.inserirFim("a");
		deque.removerFinal("a");
		assertEquals(null, deque.ultimo());
	}
	
	@Test
	public void removeInicio() {	
		Deque<String> deque = new Deque<>();
		deque.inserirInicio("a");
		deque.RemoverInicio("a");
		assertEquals(null, deque.primeiro());
	}


}
