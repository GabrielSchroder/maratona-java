package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count++);
        }


        count = 0;
        do {
            System.out.println("Contagem "+ ++count);
        } while (count < 10);

        for (int i=1; i <= 10; i ++) {
            System.out.println("Valor"+ i);
        }
    }
}
