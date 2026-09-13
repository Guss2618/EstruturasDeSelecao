public class Teste05
{
    public static void main(String[] args)
    {
        int tempa1 = Teclado.leInt("Digite A1: ");
        int tempa2 = Teclado.leInt("Digite A2: ");
        int tempb1 = Teclado.leInt("Digite B1: ");
        int tempb2 = Teclado.leInt("Digite B2: ");
        int tempc1 = Teclado.leInt("Digite C1: ");
        int tempc2 = Teclado.leInt("Digite C2: ");
        int tempd1 = Teclado.leInt("Digite D1: ");
        int tempd2 = Teclado.leInt("Digite D2: ");

        boolean A = tempa1 == tempa2;
        boolean B = tempb1 == tempb2;
        boolean C = tempc1 == tempc2;
        boolean D = tempd1 == tempd2;

        System.out.println("A = " + A + " B = " + B + " C = " + C + " D = " + D);

        if (A) {
            System.out.println("C1");
            if (B) {
                System.out.println("C2");
            } else if (C) {
                System.out.println("C3");
            } else if (D) {
                System.out.println("C4");
                System.out.println("C5");
            } else {
                System.out.println("C6");
            }
        }
    }
}
