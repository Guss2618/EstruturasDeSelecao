public class VerificarIdade_if_else {
    public static void main(String[] args) {
        int idade = Teclado.leInt("Digite a idade: ");

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
