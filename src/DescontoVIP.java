
public class DescontoVIP implements EstrategiaDeDesconto {

    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.85;
    }
}
