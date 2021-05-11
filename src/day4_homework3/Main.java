package day4_homework3;

import day4_homework3.abstracts.CampaignService;
import day4_homework3.abstracts.GameService;
import day4_homework3.abstracts.GamerService;
import day4_homework3.abstracts.SaleService;
import day4_homework3.concrete.CampaignManager;
import day4_homework3.concrete.GameManager;
import day4_homework3.concrete.GamerManager;
import day4_homework3.concrete.SaleManager;
import day4_homework3.entities.Campaign;
import day4_homework3.entities.Game;
import day4_homework3.entities.Gamer;

public class Main {

    public static void main(String[] args) {
        Campaign campaign = new Campaign("%20 indirim vardır",20,"yarı yarıya");
        Game game = new Game(60,"PUBG MOBILE","Hayatta kalma oyunu");
        Gamer gamer = new Gamer(1,"aleyrtk","123456","aleynaertok@hotmail.com");

        GamerService gamerService = new GamerManager();
        GameService gameService = new GameManager();
        CampaignService campaignService = new CampaignManager();
        SaleService saleService = new SaleManager();

        gamerService.add(gamer);
        gameService.add(game);
        campaignService.add(campaign);
        saleService.saleLogger(gamer,game,campaign);

        }
    }


