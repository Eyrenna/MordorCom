package encinas.MordorCom.pedidos;

import encinas.MordorCom.interfaces.Pedido;

public class PedidoInternacional implements Pedido {

	private String destino = null;
	private Integer peso = 0;
	
	public PedidoInternacional(String destino, Integer peso) {
		super();
		this.destino = destino;
		this.peso = peso;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public int peso() {
		// TODO Auto-generated method stub
		return peso;
	}
	public String destino() {
		// TODO Auto-generated method stub
		return destino;
	}
	

}
