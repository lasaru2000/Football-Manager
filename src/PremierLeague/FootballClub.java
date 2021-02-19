package PremierLeague;

import java.util.Date;

public class FootballClub extends SportsClub {

    private int totalWins;
    private int totalDraws;
    private int totalDefeats;
    private int recGoals;
    private int scrGoals;
    private int clubPoints;
    private int totalMatches;


    public FootballClub(String clubCOde,String clubName, String clubLocation, int totalWins, int totalDraws, int totalDefeats, int recGoals, int scrGoals, int clubPoints, int totalMatches) {

        super(clubCOde,clubName,clubLocation);

        this.totalWins =totalWins;
        this.totalDraws =totalDraws;
        this.totalDefeats =totalDefeats;
        this.recGoals =recGoals;
        this.scrGoals =scrGoals;
        this.clubPoints =clubPoints;
        this.totalMatches =totalMatches;

    }


    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public int getTotalDraws() {
        return totalDraws;
    }

    public void setTotalDraws(int totalDraws) {
        this.totalDraws = totalDraws;
    }

    public int getTotalDefeats() {
        return totalDefeats;
    }

    public void setTotalDefeats(int totalDefeats) {
        this.totalDefeats = totalDefeats;
    }

    public int getReceivedGoals() {
        return recGoals;
    }

    public void setReceivedGoals(int receivedGoals) {
        this.recGoals = receivedGoals;
    }

    public int getScoredGoals() {
        return scrGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scrGoals = scoredGoals;
    }

    public int getClubPoints() {
        return (totalWins*3 + totalDraws);
    }

    public void setClubPoints(int clubPoints) {
        this.clubPoints = clubPoints;
    }

    public int getTotalMatches() {
        return (totalWins+totalDefeats+totalDraws);
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }
    public String toString() {
        return "Football Club >>>" +
                "noOfWins:- " + totalWins + ", noOfDraws:- " + totalDraws + ", noOfDefeats:- " + totalDefeats + ", noOfScoredGoals:- " + scrGoals + ", noOfReceived:- " + recGoals + ", totalPoints:- " + clubPoints + ", noOfPlayedMatches:- " + totalMatches;
    }




}

