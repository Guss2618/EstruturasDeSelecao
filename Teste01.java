public class Teste01
{
    public static void main(String[] args)
    {
        int opcao = Teclado.leInt("Escolha o exercicio (1-a 2-b 3-c 4-d 5-e 6-f): ");

        switch (opcao) {
            case 1:
                exercicioA();
                break;
            case 2:
                exercicioB();
                break;
            case 3:
                exercicioC();
                break;
            case 4:
                exercicioD();
                break;
            case 5:
                exercicioE();
                break;
            case 6:
                exercicioF();
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }

    public static void exercicioA()
    {
        double n = Teclado.leDouble("Digite um numero: ");
        if (n > 0) {
            double raiz = Math.sqrt(n);
            System.out.println("Raiz = " + raiz);
        }
    }

    public static void exercicioB()
    {
        double media = Teclado.leDouble("Digite a media: ");
        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Precisa grau C");
        }
    }

    public static void exercicioC()
    {
        int x = Teclado.leInt("Digite x: ");
        int y = Teclado.leInt("Digite y: ");
        int z = Teclado.leInt("Digite z: ");
        int r = 0;
        if (x > y) {
            if (x > z) {
                if (y != z) {
                    r = 1;
                }
            }
        }
        System.out.println("r = " + r);
    }

    public static void exercicioD()
    {
        int x = Teclado.leInt("Digite x: ");
        int y = Teclado.leInt("Digite y: ");
        int z = Teclado.leInt("Digite z: ");
        int r = 0;
        if (x > y) {
            if (x > z) {
                if (y != z) {
                    r = 1;
                } else {
                    r = 2;
                }
            }
        }
        System.out.println("r = " + r);
    }

    public static void exercicioE()
    {
        double media = Teclado.leDouble("Digite a media do aluno: ");
        String mensagem;
        if (media >= 6.0) {
            mensagem = "Aprovado";
        } else {
            mensagem = "Precisa grau C";
        }
        System.out.println(mensagem);
    }

    public static void exercicioF()
    {
        double media = Teclado.leDouble("Digite a media: ");
        System.out.println(classificarMedia(media));
    }

    public static String classificarMedia(double media)
    {
        if (media >= 9.3) {
            return "Otimo";
        } else if (media >= 8.5) {
            return "Bom";
        } else if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Em recuperacao";
        }
    }
}
