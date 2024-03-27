package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Gabriel";
        String adress = "Lopo Gonçalves, 643";
        Double wage = 20543.74;
        String salaryReceiptData = "04/03/2024";
        String text = "Eu " + name + ", morando na rua " + adress + ", confirmo que recebi o salário de " + wage + ", na data " + salaryReceiptData;
        System.out.println(text);
    }
}
