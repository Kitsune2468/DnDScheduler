
import java.util.ArrayList;
import java.util.Date;

public record SessionData(int campaignID,
                          Date sessionDate,
                          ArrayList<Integer> registeredUserIDs) {

}
