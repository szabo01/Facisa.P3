package br.cesed.si.p3.deque;

public class Deque<T> {
private static final int TAMANHO_INICIAL_ARRAY_INTERNO = 3;
	
	private T[] arrayInterno = (T[]) new Object[TAMANHO_INICIAL_ARRAY_INTERNO];
	private int inseridos = 0;
	
	
	public void dobrarArray() {
		if(inseridos == arrayInterno.length) {
			T[] arrayTemporario = (T[]) new Object[arrayInterno.length * 2];
		
			for (int i = 0; i < arrayInterno.length; i++) {
				arrayTemporario[i] = arrayInterno[i];
			}
			arrayInterno = arrayTemporario;
		}
	
		
	}
	
	public void inserirInicio(T objeto) {
		
		if(arrayInterno[0] != null) {
			for(int i =0; i<inseridos; i++) {
				arrayInterno[i+1] = arrayInterno[i];
			}
			arrayInterno[0] = null;		
		}
		arrayInterno[0] = objeto;
		inseridos++;
	}
	
	public void inserirFim(T objeto) {
		if(inseridos == arrayInterno.length) {
			dobrarArray();		
		}
		arrayInterno[inseridos] = objeto;
		inseridos++;
		
	}
	
	public void RemoverInicio(T objeto) {
		for(int i = 0; i < inseridos; i++) {
			arrayInterno[i] = arrayInterno[i+1];
		}
		
	}
	
	public void removerFinal(T objeto) {
		arrayInterno[inseridos] = null;	
		
	}
	
	public Object primeiro(){
		return arrayInterno[0];
	}
	
	public Object ultimo(){
		
		return arrayInterno[inseridos];
	}
	
	public int tamanho(){
		return inseridos;
	}

	
}	
	

