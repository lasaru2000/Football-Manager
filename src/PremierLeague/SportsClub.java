package PremierLeague;

public class SportsClub {


    private int clubCode;
    private String clubName;
    private String clubLocation;


    public SportsClub(String ClubCode, String clubName, String clubLocation) {

        this.clubCode=clubCode;
        this.clubName =clubName;
        this.clubLocation =clubLocation;

    }

    public int getClubCode() {
        return clubCode;
    }

    public void setClubCode(int clubCode) {
        this.clubCode = clubCode;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }
}
