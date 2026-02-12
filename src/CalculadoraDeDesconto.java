public class CalculadoraDeDesconto {

    public double aplicarDesconto(Pedido pedido, EstrategiaDeDesconto estrategia) {
        return estrategia.aplicarDesconto(pedido);
    }
}