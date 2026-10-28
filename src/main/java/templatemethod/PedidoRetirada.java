package templatemethod;

public class PedidoRetirada extends Pedido {

    @Override
    public String definirEntrega() {
        return "Retirada na loja";
    }
}