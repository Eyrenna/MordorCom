package encinas.MordorCom.tratamientos;

import encinas.MordorCom.interfaces.PedidoPeligroso;
import encinas.MordorCom.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {
	
	private PedidoPeligroso pedidoConPeligro = null;
		

	public TratamientoPedidoPeligroso(PedidoPeligroso pedidoConPeligro) {
		super();
		this.pedidoConPeligro = pedidoConPeligro;
	}

	public PedidoPeligroso getPedidoConPeligro() {
		return pedidoConPeligro;
	}
	
	public void setPedidoConPeligro(PedidoPeligroso pedidoConPeligro) {
		this.pedidoConPeligro = pedidoConPeligro;
	}

	public boolean tratar() {
		if (pedidoConPeligro.instrucciones() == "no ponerselo en el dedo") {
			return false;
		} else {
			return true;
		}
		
	}
}
