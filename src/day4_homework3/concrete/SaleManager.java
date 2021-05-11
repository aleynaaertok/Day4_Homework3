package day4_homework3.concrete;

import day4_homework3.abstracts.SaleService;
import day4_homework3.entities.Campaign;
import day4_homework3.entities.Game;
import day4_homework3.entities.Gamer;

public class SaleManager implements SaleService {

    @Override
    public void saleLogger(Gamer gamer, Game game, Campaign campaign) {
        System.out.println(game.getGameName() + " isimli oyun %" + campaign.getDiscoundRate() + " indirim ile " + gamer.getUserName() + " adlı kullanıcıya satılmıştır");
    }
}
