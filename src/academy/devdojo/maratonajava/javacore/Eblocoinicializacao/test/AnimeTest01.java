package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");


        for (int episodio : anime. getEpisodios()) {
            System.out.print(episodio+ " ");
        }
    }
}
