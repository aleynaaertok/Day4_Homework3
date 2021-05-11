package day4_homework3.concrete;

import day4_homework3.abstracts.CampaignService;
import day4_homework3.entities.Campaign;

public class CampaignManager implements CampaignService {

    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası %20 indirim ile sisteme eklenmiştir");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyasının süresi bitmiştir");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyasında yenilik var");
    }
}
