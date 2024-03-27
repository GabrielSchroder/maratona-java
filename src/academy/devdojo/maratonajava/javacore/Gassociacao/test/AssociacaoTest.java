package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Lopo Gonçalves, 643");
        Aluno aluno = new Aluno("Gabriel Schröder", 23);
        Professor professor = new Professor("Dumbledore", "Defesa contra as artes das trevas");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Como se defender de Dementadores em 2024", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
