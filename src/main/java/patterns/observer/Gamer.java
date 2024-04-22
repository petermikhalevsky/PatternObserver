package patterns.observer;

import patterns.observable.ReleaseGame;

import java.util.HashSet;
import java.util.Set;

public class Gamer implements Observer {

    private String name;
    private Set<String> games = new HashSet<>();

    public Gamer(String name) {
        this.name = name;
    }

    @Override
    public void update(String game) {
        if (games.contains(game)) {
            System.out.println("I already have got this game!");
        } else {
            System.out.println(this.getName() + "says : \"Oh, Rockstar released new game " + game + "!\"");
            games.add(game);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
