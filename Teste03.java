public class Teste03
{
    public static void main(String[] args)
    {
        int x = 2;
        int y = 5;
        boolean b1 = false;
        boolean b2 = false;

        x++;
        b1 = y != x;
        b2 = (y >= x) && b1;
        System.out.println(b1 + " - " + x + " - " + b2 + " - " + y);

        y = y / x;
        b1 = !b1;
        b2 = (x == y) || b1 && b2;
        System.out.println(b1 + " - " + x + " - " + b2 + " - " + y);
    }
}
// a) Valores sucessivos de x: 2, depois 3
// b) Valor de y apos y = y / x: 1
// c) Saida na tela:
//    true - 3 - true - 5
//    false - 3 - false - 1
