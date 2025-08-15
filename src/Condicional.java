public class Condicional {
    public static void main(String[] args) {
        int anoDeLançamento = 2001;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.9;
        String tipoDoPlano = "Plus";

        if (anoDeLançamento >= 2024) {
            System.out.println("Lançamentos que os usuarios estão curtindo!");
        }else {
            System.out.println("Filme Retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoDoPlano.equals("Plus")) {
            System.out.println("Filme Incluso no Plano!");
        } else {
            System.out.println("É necessario pagar a locação!");
        }

    }
}
