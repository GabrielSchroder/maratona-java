package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda-feira");
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Terça-feira");
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Quarta-feira");
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Quinta-feira");
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Sexta-feira");
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("Fim de semana");
                break;
            default:
            System.out.println("Opção inválida");
        }
    }
}
