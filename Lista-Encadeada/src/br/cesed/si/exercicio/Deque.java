package br.cesed.si.exercicio;

public class Deque {
	private NodeDeque primeiroNo;
	private int inseridos = 0;
	
	
	public Deque(){
		this.primeiroNo = null;
	}
	
	public void addPrimeiroNo(String valor){
		if(this.primeiroNo == null){
			this.primeiroNo = new NodeDeque(valor);
			inseridos++;
		}else{
			NodeDeque novoNo = new NodeDeque(valor);
			novoNo.proximoNo = primeiroNo;
			this.primeiroNo = novoNo;
			inseridos++;
			
		}
	}
	
	public String removerPrimeiroNo(){
		if(!(this.primeiroNo ==null)){
			this.primeiroNo = this.primeiroNo.getNext();
			inseridos--;
			return this.primeiroNo.getValor();
		}
		else{
			return null;
		}
	}
	
	public void addUltimoNo(String valor){
		if(this.primeiroNo == null){
			this.primeiroNo = new NodeDeque(valor);
		}else {
			NodeDeque atual = this.primeiroNo;
			while(atual.proximoNo != null){
				atual = atual.proximoNo;
			}
			atual.proximoNo = new NodeDeque(valor);
			inseridos ++;
		}
	}
	
	public String removerUltimoNo(){
		if(!(this.primeiroNo == null)){
			NodeDeque novoNo = this.primeiroNo;
			for(int i = 0; i < inseridos-2; i++){
				novoNo = novoNo.getNext();
			}
			novoNo.proximoNo = null;
			inseridos --;
			return novoNo.getValor();
		}else {
			return null;
		}
	}
	
	public int getTamanho(){
		return inseridos;
	}
	
	public String getPrimeiroNo(){
		if(!(this.primeiroNo == null)){
			return this.primeiroNo.getValor();
		}
		return null;
	}
	
	public String getUltimoNo(){
		if(!(this.primeiroNo == null)){
			NodeDeque novoNo = null;
			for(int i = 0; i < inseridos -1; i++){
				novoNo = this.primeiroNo.getNext();
			}
			return novoNo.getValor();
		}
		return null;
	}
}
