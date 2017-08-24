
public class Configuracao {
	private static Configuracao instancia; //Atributo est�tico para guardar a �nica inst�ncia desta classe.

    private String ip;
    private int porta;
    private String usuario;
    private String senha;

    private Configuracao(){ //Construtor privado para garantir que ningu�m poder� acess�-lo, e desta forma instaciar, fora desta classe
    }

    public static Configuracao getInstancia(){ // M�todo est�tico que retorna a inst�ncia, e se n�o existir inst�ncia a pr�pria classe
        if (instancia==null){
            instancia=new Configuracao();
            //Agora � s� chamar a inst�ncia em quantas classes for necess�rio, lembrando de ter a certeza de existir apenas uma!
        }
        return instancia;
    }

    public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static void setInstancia(Configuracao instancia) {
		Configuracao.instancia = instancia;
	}

	public void autenticar(){
    }

}
