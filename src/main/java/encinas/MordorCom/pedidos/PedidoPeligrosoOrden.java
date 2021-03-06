package encinas.MordorCom.pedidos;

import java.util.UUID;

import encinas.MordorCom.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

	private String destino = null;
	private Integer peso = 0;
	private String instrucciones = null;
	private String id = UUID.randomUUID().toString();

	public PedidoPeligrosoOrden(String destino, String instrucciones) {
		super();
		this.destino = destino;
		this.instrucciones = instrucciones;
	}
	
	public int peso() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String destino() {
		// TODO Auto-generated method stub
		return destino;
	}

	public void setInstrucciones(String instruccion) {
		this.instrucciones = instruccion;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String instrucciones() {
		return instrucciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
