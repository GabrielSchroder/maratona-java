package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        System.out.println(result);

        // %
        int rest = 21 % 7;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenSamallerThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenDifferentFromTwenty = 10 != 20;

        System.out.println("Is ten greater than twenty? "+isTenGreaterThanTwenty);
        System.out.println("Is ten smaller than twenty? "+isTenSamallerThanTwenty);
        System.out.println("Is ten equal to twenty? "+isTenEqualToTwenty);
        System.out.println("Is ten different from twenty? "+isTenDifferentFromTwenty);

        // && (AND) || (or)
        int idade = 29;
        float salario = 3500f;
        boolean isInTheLawOverThirty = idade >= 30 && salario >= 4612;
        boolean isInTheLawUnderThirty = idade < 30 && salario >= 3381;

        System.out.println("É dentro da lei maior que trinta? "+ isInTheLawOverThirty);
        System.out.println("É dentro da lei menor que trinta? "+isInTheLawUnderThirty);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlayStationFive = 5000f;
        boolean isPlayStationFivePurchasable = valorTotalContaCorrente > valorPlayStationFive || valorTotalContaPoupança > valorPlayStationFive;
        System.out.println("Is PlayStation Five Purchasable? "+isPlayStationFivePurchasable);
    }
}
