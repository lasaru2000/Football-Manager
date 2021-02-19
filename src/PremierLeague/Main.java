package PremierLeague;

import java.util.Scanner;

public class Main {
    private static Scanner SCa = new Scanner(System.in);
    public static PremierLeagueManager premierLeagueManager = new PremierLeagueManager();


    public static void main(String[] args) {
        System.out.println("Premier League Manager");
        int value = 0;

        while (value != 8) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("CLI");
            System.out.println("Select your Choice");
            System.out.println("1 > Add Club to premier League");
            System.out.println("2 > Delete Club from premier League");
            System.out.println("3 > Display Statistics Table");
            System.out.println("4 > Display League Table");
            System.out.println("5 > Add a match");
            System.out.println("6 > Save");
            System.out.println("7 > Load");
            System.out.println("8 > GUI");
            System.out.println("9 > Exit");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            System.out.println("Enter choice  >>>");
            value = Validation();


            switch (value) {
                case 1:
                    Add();
                    break;
                case 2:
                    Delete();
                    break;
                case 3:
                    Statistics();
                    break;
                case 4:
                    Table();
                    break;
                case 5:
                    Addmatch();
                    break;
                case 6:
                    save();
                    break;
                case 7:
                    Load();
                    break;
                case 8:
                    GUI();
                    break;
                case 9:
                    System.out.println("Thanks you come again");
                    System.exit(0);
                default:
                    System.out.println("Enter a Valid Number");
            }

        }
    }



    private static void GUI(){premierLeagueManager.GUI();}
    private static void Load(){premierLeagueManager.Load(); }
    private static void save (){premierLeagueManager.save();}
    private static void Addmatch(){premierLeagueManager.Addmatch();}
    private static void Table(){premierLeagueManager.Table(); }
    private static void Statistics(){premierLeagueManager.Statistics(); }

    private static void Delete(){premierLeagueManager.Delete(); }

    private static void Add (){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Details");

        System.out.print("Enter Club code: ");
        String clubCode  = input.next();


        System.out.print("Enter Club Name: ");
        String clubName  = input.next();


        System.out.print("Enter Club Location: ");
        String clubLocation  = input.next();

        System.out.print("Enter Total Wins: ");
        int totalWins  = input.nextInt();


        System.out.print("Enter Total draws: ");
        int totalDraws  = input.nextInt();


        System.out.print("Enter Total defeats: ");
        int totalDefeats  = input.nextInt();


        System.out.print("Enter  Scored Goals: ");
        int scrGoals  = input.nextInt();


        System.out.print("Enter Received Goals: ");
        int recGoals   = input.nextInt();


        System.out.print("Enter Total Points: ");
        int clubPoints  = input.nextInt();


        System.out.print("Enter Total Played Matches: ");
        int totalMatches  = input.nextInt();

        FootballClub footballClub = new FootballClub(clubCode,clubName,clubLocation,totalWins,totalDraws,totalDefeats,recGoals,scrGoals,clubPoints,totalMatches);
        premierLeagueManager.Add(footballClub);
    }

    private static int Validation(){
        while (!SCa.hasNextInt()) {
            System.out.println("Pls Re-enter");
            SCa.next();
        }
        return SCa.nextInt();
    }





}



