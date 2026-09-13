public class CalcularPreco_IF_SwitchCase {
    public static void main(String[] args) {
        int idade = Teclado.leInt("Digite a idade: ");
        double precoBase = 50.0;
        double precoFinal;

        if (idade < 12) {
            precoFinal = precoBase * 0.5;
            System.out.println("Categoria: Crianca (50% de desconto)");
        } else if (idade <= 17) {
            precoFinal = precoBase * 0.7;
            System.out.println("Categoria: Adolescente (30% de desconto)");
        } else if (idade >= 60) {
            precoFinal = precoBase * 0.6;
            System.out.println("Categoria: Idoso (40% de desconto)");
        } else {
            precoFinal = precoBase;
            System.out.println("Categoria: Adulto (preco cheio)");
        }

        int formaPagamento = Teclado.leInt("Forma de pagamento (1-Dinheiro 2-Debito 3-Credito): ");

        switch (formaPagamento) {
            case 1:
                precoFinal = precoFinal * 0.95;
                System.out.println("Pagamento em dinheiro: 5% de desconto extra");
                break;
            case 2:
                System.out.println("Pagamento no debito: sem alteracao");
                break;
            case 3:
                precoFinal = precoFinal * 1.05;
                System.out.println("Pagamento no credito: 5% de acrescimo");
                break;
            default:
                System.out.println("Forma de pagamento invalida. Mantendo o preco da categoria.");
                break;
        }

        System.out.printf("Preco final: R$ %.2f%n", precoFinal);
    }
}
