package day4_homework3.entities;

public class Campaign {
    private String informationAboutDiscount;
    private int discoundRate;
    private String campaignName;

    public Campaign(String informationAboutDiscount, int discoundRate,String campaignName) {
        this.informationAboutDiscount = informationAboutDiscount;
        this.discoundRate = discoundRate;
        this.campaignName = campaignName;
    }

    public String getInformationAboutDiscount() {
        return informationAboutDiscount;
    }

    public void setInformationAboutDiscount(String informationAboutDiscount) {
        this.informationAboutDiscount = informationAboutDiscount;
    }

    public int getDiscoundRate() {
        return discoundRate;
    }

    public void setDiscoundRate(int discoundRate) {
        this.discoundRate = discoundRate;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
