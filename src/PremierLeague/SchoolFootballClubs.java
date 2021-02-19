package PremierLeague;

import java.util.Date;

public class SchoolFootballClubs extends FootballClub{

    private int sclCode;
    private String sclCptName;
    private String sclHeadCoachName;

    public SchoolFootballClubs(String clubCode,String clubName,String clubLocation,int totalWins,int totalDraws,int totalDefeats,int recGoals,int scrGoals,int clubPoints, int totalMatches,Date date,int sclCode,String sclCptName,String sclHeadCoachName) {
        super(clubCode,clubName,clubLocation,totalWins,totalDraws,totalDefeats,recGoals,scrGoals,clubPoints, totalMatches);
        this.sclCode = sclCode;
        this.sclCptName = sclCptName;
        this.sclHeadCoachName = sclHeadCoachName;
    }
    public int getSclCode() {
        return sclCode;
    }

    public void setSclCode(int sclCode) {
        this.sclCode = sclCode;
    }

    public String getSclCptName() {
        return sclCptName;
    }

    public void setSclCptName(String sclCptName) {
        this.sclCptName = sclCptName;
    }

    public String getSclHeadCoachName() {
        return sclHeadCoachName;
    }

    public void setSclHeadCoachName(String sclHeadCoachName) {
        this.sclHeadCoachName = sclHeadCoachName;
    }
}

