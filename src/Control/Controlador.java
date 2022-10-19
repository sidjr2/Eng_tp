package Control;

public class Controlador {
	private Modelo modelo;
	
	public Controlador(Modelo modelo) {
		this.modelo = modelo;
	}
	
	public void vender() {
		modelo.atualiza();
	}

	public void Cardapio() {
		modelo.atualiza();
		
	}
}
