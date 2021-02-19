package PremierLeague;


import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PremierLeagueManager implements LeagueManager {

    static Scanner input = new Scanner(System.in);
    static public List<FootballClub> clubs = new ArrayList<>();

    private List<FootballClub> getClubList() {
        return clubs;
    }


    @Override
    public int Add(FootballClub footballClub) {

        if (footballClub != null) {
            clubs.add(footballClub);
            System.out.println(footballClub.getClubName() + "Added ");
        } else {
            System.out.println("Pls add correct details");
        }
        return 0;
    }


    public FootballClub Delete() {

        System.out.println(" Delete a club");
        System.out.println("============================================================");

        System.out.print("Enter Club Name");
        String dltClub = input.next();

        for (FootballClub fcl : clubs) {
            if (fcl.getClubName().equals(dltClub)) {
                clubs.remove(fcl);
                System.out.println(fcl.getClubName() + "club is deleted now!!!");
                return fcl;
            }
        }
        System.out.println("please Enter a Valid club!!!");

        return null;
    }

    @Override
    public void Statistics() {

        System.out.println(" Display Club Statics");
        System.out.println("============================================================");

        System.out.print("Enter Club Name");
        String clubName = input.next();

        for (FootballClub fClubs : clubs) {
            if (fClubs.getClubName().equals(clubName)) {
                System.out.println("Total Club Wins =>" + fClubs.getTotalWins());
                System.out.println("Total Club Draws =>" + fClubs.getTotalDraws());
                System.out.println("Total Club Defeats =>" + fClubs.getTotalDefeats());
                System.out.println("Total Club Scored Goals =>" + fClubs.getScoredGoals());
                System.out.println("Total Club Received Goals =>" + fClubs.getReceivedGoals());
                System.out.println("Total Club Points =>" + fClubs.getClubPoints());
                System.out.println("Total Club Played matches =>" + fClubs.getTotalMatches());
            }
        }

    }

    @Override

    public void Table() {

        System.out.println("League Table");
        System.out.println("============================================================");
        System.out.println();

        for (FootballClub ViewList : clubs) {

            System.out.println(" ClubName       =>" + ViewList.getClubName());
            System.out.println(" ClubLocation       =>" + ViewList.getClubLocation());
            System.out.println();

        }

    }

    @Override

    public void save() {
        File nFile = new File("Football.txt");
        BufferedWriter BW = null;
        try {
            BW = new BufferedWriter(new FileWriter(nFile));
            for (FootballClub Fat : getClubList()) {
                BW.write(Fat.getClubCode() + "," + Fat.getClubName() + "," + Fat.getClubLocation() + "," + Fat.getTotalWins() + "," + Fat.getTotalDraws()
                        + "," + Fat.getTotalDefeats() + "," + Fat.getReceivedGoals() + "," + Fat.getScoredGoals() + "," + Fat.getClubPoints() + "," + Fat.getTotalMatches() + "\n");
            }
            BW.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                BW.close();
                System.out.println("Saved to Football.txt");
            } catch (Exception e) {


            }
        }
    }

    @Override

    public void Load() {
        BufferedReader BR = null;
        try {
            BR = new BufferedReader(new FileReader("Football.txt"));
            String records;

            while ((records = BR.readLine()) != null) {
                System.out.println(records);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BR.close();
        } catch (IOException e) {
            System.out.println("Error !!!!");
            e.printStackTrace();
        }

    }


    @Override
    public void Addmatch() {
        int N = 1;
        for (FootballClub club : clubs) {
            System.out.println(N + "." + club.getClubName());
            N++;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Played matches");

        System.out.println("Enter Team 1 Code>>");
        int tm1 = input.nextInt() - 1;

        System.out.println("scored goals>>");
        int tm1G = input.nextInt();

        System.out.println("Enter team 2 Code");
        int tm2 = input.nextInt() - 1;

        System.out.println("Scored goals");
        int tm2G = input.nextInt();

        clubs.get(tm1).setScoredGoals(clubs.get(tm1).getScoredGoals() + tm1G);
        clubs.get(tm1).setReceivedGoals(clubs.get(tm2).getReceivedGoals() + tm2G);
        clubs.get(tm2).setScoredGoals(clubs.get(tm2).getScoredGoals() + tm2G);
        clubs.get(tm2).setReceivedGoals(clubs.get(tm1).getReceivedGoals() + tm1G);

        if (tm1G > tm2G) {
            clubs.get(tm1).setTotalWins(clubs.get(tm1).getTotalWins() + 1);
            clubs.get(tm2).setTotalDefeats(clubs.get(tm2).getTotalDefeats() + 1);

        } else if (tm1G == tm2G) {
            clubs.get(tm1).setTotalDraws(clubs.get(tm1).getTotalDraws() + 1);
            clubs.get(tm2).setTotalDraws(clubs.get(tm2).getTotalDraws() + 1);

        } else {
            clubs.get(tm2).setTotalWins(clubs.get(tm2).getTotalWins() + 1);
            clubs.get(tm1).setTotalDefeats(clubs.get(tm1).getTotalDefeats() + 1);
        }

    }

    @Override
    public void GUI() {
        System.out.println("Football Table will pop Up!!");
        GUI.main(null);


    }


}



