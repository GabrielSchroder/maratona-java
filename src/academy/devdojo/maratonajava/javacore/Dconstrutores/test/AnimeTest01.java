package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 12, "Ação");
        Anime anime2 = new Anime ("Dragon ball Z", "TV", 540, "Ação");
        Anime anime3 = new Anime();

        anime.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
