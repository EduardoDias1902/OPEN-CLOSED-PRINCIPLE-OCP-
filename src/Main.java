public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(
                "001",
                1000.0,
                3,
                "cliente@email.com"
        );

        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();

        // 🔥 Aplicando desconto de ANIVERSÁRIO (novo tipo)
        EstrategiaDeDesconto estrategia = new DescontoAniversario();

        double valorFinal = calculadora.aplicarDesconto(pedido,estrategia);

        System.out.println("Valor original: " + pedido.getValorBruto());
        System.out.println("Valor com desconto: " + valorFinal);
    }
}