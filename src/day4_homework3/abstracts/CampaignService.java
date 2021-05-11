package day4_homework3.abstracts;

import day4_homework3.entities.Campaign;

public interface CampaignService {

    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update (Campaign campaign);
}
