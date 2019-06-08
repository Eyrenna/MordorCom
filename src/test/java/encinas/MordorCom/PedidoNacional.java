package encinas.MordorCom;

import java.util.UUID;

import encinas.MordorCom.interfaces.Pedido;

public class PedidoNacional implements Pedido {

	private String destino = null;
	private Integer peso = 0;
	private String instrucciones = null;
	private String id = UUID.randomUUID().toString();
	

	public PedidoNacional(String destino, Integer peso) {
		super();
		this.destino = destino;
		this.peso = peso;
	}

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

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
