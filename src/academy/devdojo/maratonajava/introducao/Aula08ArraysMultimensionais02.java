package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultimensionais02 {
    public static void main(String[] args) {

        int [] [] arrayInt = new int [3][];

        arrayInt [0] = new int[2];
        arrayInt [1] = new int[3];
        arrayInt [2] = new int[6];

        // é possível colocar os valores dos arrays de arrays, mas neste caso deixei sem.

        for (int [] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
