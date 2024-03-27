package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o Médico Sem Fronteiras";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemDoar;

        System.out.println(resultado);
    }
}
