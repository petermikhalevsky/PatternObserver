package patterns;

import patterns.observable.ReleaseGame;
import patterns.observer.Gamer;

public class Main {    public static void main(String[] args) {
    ReleaseGame releaseGame = new ReleaseGame();
    releaseGame.addObserver(new Gamer("Ivan"));
    releaseGame.addObserver(new Gamer("Peter"));
    releaseGame.addObserver(new Gamer("Olga"));

    String game = "GTA 5";

        for (int i = 0; i < 2; i++) {
            releaseGame.release(game);
        }
    }
}
