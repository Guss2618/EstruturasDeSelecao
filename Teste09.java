public class Teste09
{
    public static void main(String[] args)
    {
        int idade = Teclado.leInt("Digite a idade do Atleta: ");
        double peso = 0;

        if ((idade >= 15 && idade <= 17) || (idade >= 18 && idade <= 25)) {
            peso = Teclado.leDouble("Digite o peso do Atleta: ");
        }

        String categoria = obterCategoria(idade, peso);
        System.out.println(idade + " anos a Categoria eh " + categoria);
    }

    public static String obterCategoria(int idade, double peso)
    {
        if (idade <= 14) {
            return "Infantil";
        } else if (idade >= 15 && idade <= 17) {
            if (peso <= 50) {
                return "Juvenil leve";
            } else {
                return "Juvenil pesado";
            }
        } else if (idade >= 18 && idade <= 25) {
            if (peso <= 60) {
                return "Senior leve";
            } else {
                return "Senior pesado";
            }
        } else {
            return "Veterano";
        }
    }
}
