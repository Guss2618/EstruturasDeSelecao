public class Teste12
{
    public static void main(String[] args)
    {
        double n1 = Teclado.leDouble("Digite a primeira nota: ");
        double n2 = Teclado.leDouble("Digite a segunda nota: ");
        double n3 = Teclado.leDouble("Digite a terceira nota: ");

        double media = (n1 + n2 + n3) / 3.0;
        System.out.println("Media = " + media);

        if ((media >= 0) && (media < 4)) {
            System.out.println("Nota E");
        } else if (media < 5) {
            System.out.println("Nota D");
        } else if (media < 7) {
            System.out.println("Nota C");
        } else if (media < 8) {
            System.out.println("Nota B");
        } else if (media <= 10) {
            System.out.println("Nota A");
        }
    }
}
