package br.cesed.si.exercicio;


public class NodeDeque {
	private String valor;
	protected NodeDeque proximoNo;
	
	public NodeDeque(String valor) {
		
		this.valor = valor;
		this.proximoNo = null;
	}
	
	public String getValor() {
		
		return this.valor;
	}
	
	public void setProximo(NodeDeque proximo) {
		
		this.proximoNo = proximo;
	}
	
	public NodeDeque getNext() {
		
		return this.proximoNo;
	}

}
