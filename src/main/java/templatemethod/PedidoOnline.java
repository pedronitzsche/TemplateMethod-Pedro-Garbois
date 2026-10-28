package templatemethod;

public class PedidoOnline extends Pedido {

    @Override
    public String definirEntrega() {
        return "Entrega por transportadora";
    }
}