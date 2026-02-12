public class DescontoCupom implements EstrategiaDeDesconto {
    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.90;
    }
}
