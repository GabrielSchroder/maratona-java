package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.nome = "Fiesta";
        carro.modelo = "Seda";
        carro.ano = 2015;

        System.out.println("Carro 1:");
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        Carro carro2 = new Carro();

        carro2.nome = "L200";
        carro2.modelo = "4X4";
        carro2.ano = 2009;

        System.out.println("\nCarro 2:");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
