
package high.score;

import java.util.Scanner;

/**
 *
 * @author Jonathan Racioppo
 * This program is for IGN's code-foo.  We created a few classes to handle file IO and sort 
 * the high scores properly.  Your high score is determined by your name, so Jon will 
 * give a different value than Bob.
 * 
 * 
 */

public class HighScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This program will take input so use Scanner
        HighScoreManager hm = new HighScoreManager();
        float score;
        String name;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type in a name to get a high score, different names get different scores");
        name = input.next();
        
        //Were gonna set a high score based on your name
        score = name.charAt(0) * name.charAt(name.length()-1) / 0.5f;
        System.out.println(name + " your high score is " + score);
        
        //Add a high score based on input
        hm.addScore(name,score);
        
        //Finally, show the results
        System.out.print(hm.getHighscoreString());
    }

}
