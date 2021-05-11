package day4_homework3.entities;

import day4_homework3.concrete.GameManager;

public class Game {
   private double unitPrice;
   private String gameName;
   private String dataGame;

    public Game(double unitPrice, String gameName, String dataGame) {
        this.unitPrice = unitPrice;
        this.gameName = gameName;
        this.dataGame = dataGame;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDataGame() {
        return dataGame;
    }

    public void setDataGame(String dataGame) {
        this.dataGame = dataGame;
    }
}
