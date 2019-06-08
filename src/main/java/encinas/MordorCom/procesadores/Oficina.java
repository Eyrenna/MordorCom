package encinas.MordorCom.procesadores;

import encinas.MordorCom.interfaces.Procesador;
import encinas.MordorCom.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

	public boolean procesa(TratamientoPedido pedido) {
		if (pedido.tratar()) {
			return true;
		} else {
			return false;
		}
	}

}
