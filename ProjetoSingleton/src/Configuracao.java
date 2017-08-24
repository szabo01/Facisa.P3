
public class Configuracao {
	private static Configuracao instancia; //Atributo estático para guardar a única instância desta classe.

    private String ip;
    private int porta;
    private String usuario;
    private String senha;

    private Configuracao(){ //Construtor privado para garantir que ninguém poderá acessá-lo, e desta forma instaciar, fora desta classe
    }

    public static Configuracao getInstancia(){ // Método estático que retorna a instância, e se não existir instância a própria classe
        if (instancia==null){
            instancia=new Configuracao();
            //Agora é só chamar a instância em quantas classes for necessário, lembrando de ter a certeza de existir apenas uma!
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
