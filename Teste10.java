public class Teste10
{
    public static void main(String[] args)
    {
        String nome1 = Teclado.leString("Digite o nome da 1 Pessoa: ");
        int idade1 = Teclado.leInt("Digite a idade da 1 Pessoa: ");
        Pessoa p1 = new Pessoa(nome1, idade1);

        String nome2 = Teclado.leString("Digite o nome da 2 Pessoa: ");
        int idade2 = Teclado.leInt("Digite a idade da 2 Pessoa: ");
        Pessoa p2 = new Pessoa(nome2, idade2);

        String resultado = compararIdades(p1, p2);
        System.out.println(resultado);
    }

    public static String compararIdades(Pessoa pessoa1, Pessoa pessoa2)
    {
        if (pessoa1.getIdade() > pessoa2.getIdade()) {
            return pessoa1.getNome();
        } else if (pessoa1.getIdade() < pessoa2.getIdade()) {
            return pessoa2.getNome();
        } else {
            return "Mesma idade";
        }
    }
}
