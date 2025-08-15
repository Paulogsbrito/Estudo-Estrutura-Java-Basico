import java.util.Scanner;

 public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de Lançamento?");
        int anoDeLançamento = leitura.nextInt();
        System.out.println("Qual sua avaliação para o filme: ");
        double avaliação = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliação);


    }
}
