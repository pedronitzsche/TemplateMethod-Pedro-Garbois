package templatemethod;

public abstract class Pedido {

    public final String processar() {
        return validar()
                + " | "
                + definirEntrega()
                + " | "
                + finalizar();
    }

    public String validar() {
        return "Pedido validado";
    }

    public abstract String definirEntrega();

    public String finalizar() {
        return "Pedido finalizado";
    }
}