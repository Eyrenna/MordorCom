package encinas.MordorCom.procesadores;

import encinas.MordorCom.enums.STATUS;
import encinas.MordorCom.interfaces.Pedido;
import encinas.MordorCom.interfaces.Procesador;
import encinas.MordorCom.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

	public boolean procesa(TratamientoPedido tratamiento) {
		if (tratamiento.tratar()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String printarStatus(Boolean procesable, Pedido pedido) {
		if (procesable) {
			return pedido.destino() + " " + STATUS.ACEPTADO.name();
		} else {
			return pedido.destino() + " " + STATUS.RECHAZADO.name();
		}
	}

}
