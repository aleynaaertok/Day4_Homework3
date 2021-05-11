package day4_homework3.abstracts;

import day4_homework3.entities.Campaign;
import day4_homework3.entities.Game;
import day4_homework3.entities.Gamer;

public interface SaleService {
    void saleLogger(Gamer gamer, Game game, Campaign campaign);
}
