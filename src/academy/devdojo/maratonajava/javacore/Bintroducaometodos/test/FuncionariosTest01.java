package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Aroldo Zuckenberg";
        funcionario.idade = 55;
        funcionario.salarios = new double [] {1220, 5400, 3000};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
