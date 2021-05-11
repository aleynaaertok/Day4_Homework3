package day4_homework3.concrete;

import day4_homework3.abstracts.GameService;
import day4_homework3.entities.Game;

public class GameManager implements GameService {

    public void add(Game game) {
        System.out.println(game.getGameName() + " oyunu sisteme eklenmiştir");
    }

    public void delete(Game game) {
        System.out.println(game.getGameName() + " oyunu silinmiştir.");
    }

    public void update(Game game) {
        System.out.println(game.getGameName() + " oyunu güncellenmiştir.");
    }
}
