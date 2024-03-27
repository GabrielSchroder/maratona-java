package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpresoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpresoraEstudante impressora = new ImpresoraEstudante();

        estudante01.nome = "Gabriel";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        impressora.imprime(estudante01);

        estudante02.nome = "Naruto";
        estudante02.idade = 16;
        estudante02.sexo = 'M';

        impressora.imprime(estudante02);
    }
}
