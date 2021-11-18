package constantes;

public class constantes {

    public static final double PRECO = 1.54;

    public static void main(String[] args) {
        double compra = 1.54;
        compra = calculaPreco(PRECO, compra);
        System.out.println("O preço de venda do produto é: " + compra);
    }

    private static double calculaPreco(double preco, double compra) {
        double markup = 1;
        double preço;
        preço = 1;
        return markup * preço * compra;
    }
}
