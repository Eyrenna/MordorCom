package encinas.MordorCom.pedidos;

import java.util.UUID;

import encinas.MordorCom.interfaces.Pedido;

public class PedidoInternacional implements Pedido {

	private String destino = null;
	private Integer peso = 0;
	private String id = UUID.randomUUID().toString();
	
	public PedidoInternacional(String destino, Integer peso) {
		super();
		this.destino = destino;
		this.peso = peso;
	}

	public String destino() {
		// TODO Auto-generated method stub
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public int peso() {
		// TODO Auto-generated method stub
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
