public class Teste02
{
    public static void main(String[] args)
    {
        int a = Teclado.leInt("Digite o valor de a: ");
        int b = Teclado.leInt("Digite o valor de b: ");
        int c = Teclado.leInt("Digite o valor de c: ");
        int guarda;

        boolean if1 = false;
        boolean if2 = false;
        boolean if3 = false;

        if (a < b) {
            if1 = true;
            guarda = a;
            a = b;
            b = guarda;
        }

        if (b < c) {
            if2 = true;
            guarda = b;
            b = c;
            c = guarda;
            if (a < b) {
                if3 = true;
                guarda = a;
                a = b;
                b = guarda;
            }
        }

        System.out.println("if1: " + if1);
        System.out.println("if2: " + if2);
        System.out.println("if3: " + if3);
        System.out.println("Valores finais: a=" + a + " b=" + b + " c=" + c);
    }
}
