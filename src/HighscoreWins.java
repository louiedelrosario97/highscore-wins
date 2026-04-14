import java.util.Scanner;
import java.util.regex.Pattern;

public class HighscoreWins {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Score (Format: Home:Visitor|12:25) ");
        String gameScore = scan.nextLine();


        // We need Split string into categories (teams and scores)
        String[] sectionSplit = gameScore.split("\\|");

        String teamSection = sectionSplit [0];
        String scoreSection = sectionSplit [1];

        // We need split both sections using : as the split
        String[] teams = teamSection.split(":");
        String[] scores = scoreSection.split(":");

        // Create string variables for each element
        String team1 = teams [0];
        String team2 = teams [1];

        /*
        String score1 = scores [0];   // this won't work, we need these variables to be integers
        String score2 = scores [1];
        */

        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        if (score1 > score2) {     // I can't compare two strings so, I need to convert score1 and score2 into integers
            System.out.println("Winner: " + score1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + score2);
        } else
            System.out.println("Contest is a Draw");
        }

    }



