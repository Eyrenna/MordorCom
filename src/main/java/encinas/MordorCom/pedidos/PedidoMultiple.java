package encinas.MordorCom.pedidos;

import java.util.UUID;

import encinas.MordorCom.interfaces.Pedido;

public class PedidoMultiple implements Pedido {
	
	private String destino = null;
	private Integer peso = 0;
	private String id = UUID.randomUUID().toString();

	public String destino() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public int peso() {
		// TODO Auto-generated method stub
		return 0;
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
