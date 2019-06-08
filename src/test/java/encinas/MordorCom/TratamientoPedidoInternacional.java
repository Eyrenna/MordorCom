package encinas.MordorCom;

import encinas.MordorCom.interfaces.TratamientoPedido;
import encinas.MordorCom.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

	private PedidoInternacional pedidoInt = null;
	
	public TratamientoPedidoInternacional(PedidoInternacional pedidoInt) {
		super();
		this.setPedidoInt(pedidoInt);
	}

	public PedidoInternacional getPedidoInt() {
		return pedidoInt;
	}

	public void setPedidoInt(PedidoInternacional pedidoInt) {
		this.pedidoInt = pedidoInt;
	}
	
	public boolean tratar() {
		if (pedidoInt.destino() != "Mordor" ) {
			return true;
		} else {
			return false;
		}
	}


}
