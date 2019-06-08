package encinas.MordorCom.tratamientos;

import java.util.Set;

import encinas.MordorCom.interfaces.Pedido;
import encinas.MordorCom.interfaces.TratamientoPedido;

public class TratamientoPedidoMultiple implements TratamientoPedido {
	
	private Set<Pedido> pedidos = null;
	private double numBultos = 0d;
	private double pesoTotal = 0d;

	public TratamientoPedidoMultiple(Set pedidos) {
		super();
		this.pedidos = pedidos;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public double getNumBultos() {
		return numBultos;
	}
	
	public void calcularTotalBultos() {
		numBultos = pedidos.size();
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void calcularPesoTotal() {
		for (Pedido pedido : pedidos) {
			pesoTotal += pedido.peso();
		}
	}

	@Override
	public boolean tratar() {
		if ((getPesoTotal() > 0) && (pedidos.size() == getNumBultos())) {
			return true;
		} else {
			return false;
		}
	}

}
