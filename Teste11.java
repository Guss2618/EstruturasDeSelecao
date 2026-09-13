public class Teste11
{
    public static void main(String[] args)
    {
        int a = Teclado.leInt("Digite o primeiro numero: ");
        int b = Teclado.leInt("Digite o segundo numero: ");
        calcular(a, b);
    }

    public static void calcular(int a, int b)
    {
        int resultado;

        System.out.println("========== MENU ==========");
        System.out.println("1- Adicao");
        System.out.println("2- Subtracao");
        System.out.println("3- Multiplicacao");
        System.out.println("4- Divisao");

        int op = Teclado.leInt("Qual destas operacoes voce deseja realizar? ");

        switch (op) {
            case 1:
                resultado = a + b;
                System.out.println("O resultado da adicao eh: " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("O resultado da subtracao eh: " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("O resultado da multiplicacao eh: " + resultado);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Nao e possivel dividir por zero");
                } else {
                    resultado = a / b;
                    System.out.println("O resultado da divisao eh: " + resultado);
                }
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }
}
