package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveProcessarPedidoOnline() {
        Pedido pedido = new PedidoOnline();

        assertEquals(
                "Pedido validado | Entrega por transportadora | Pedido finalizado",
                pedido.processar()
        );
    }

    @Test
    void deveProcessarPedidoRetirada() {
        Pedido pedido = new PedidoRetirada();

        assertEquals(
                "Pedido validado | Retirada na loja | Pedido finalizado",
                pedido.processar()
        );
    }
}