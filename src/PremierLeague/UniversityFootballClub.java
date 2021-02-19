package PremierLeague;

import java.util.Date;

public class UniversityFootballClub extends FootballClub{

    private int univCode;
    private String univCptName;
    private String univHeadCoachName;

    public UniversityFootballClub(String clubCode,String clubName, String clubLocation,int totalWins, int totalDraws, int totalDefeats, int recGoals, int scrGoals, int clubPoints, int totalMatches, Date date, int univCode, String univCptName,String UnivHeadCo) {
        super(clubCode,clubName,clubLocation,totalWins,totalDraws,totalDefeats,recGoals,scrGoals,clubPoints, totalMatches);
        this.univCode = univCode;
        this.univCptName = univCptName;
        this.univHeadCoachName =univHeadCoachName;
    }
    public int getUnivCode() {
        return univCode;
    }

    public void setUnivCode(int univCode) {
        this.univCode = univCode;
    }

    public String getUnivCptName() {
        return univCptName;
    }

    public void setUnivCptName(String univCptName) {
        this.univCptName = univCptName;
    }

    public String getUnivHeadCoachName() {
        return univHeadCoachName;
    }

    public void setUnivHeadCoachName(String univHeadCoachName) {
        this.univHeadCoachName = univHeadCoachName;
    }
}

