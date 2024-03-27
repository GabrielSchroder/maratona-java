package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros () {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros () {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros (int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoiNumeros (double num, double num2) {
        return num/num2;
    }

    public void alteraDoisNumeros (int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do AlteraDoisNumeros");
        System.out.println("Num1= " + num1);
        System.out.println("Num2= " + num2);

        
    }

}
