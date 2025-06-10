import java.util.ArrayList;

public record CampaignData(int campaignID,
                           String campaignName,
                           int dmID,
                           ArrayList<Integer> playerIDs) {

}
