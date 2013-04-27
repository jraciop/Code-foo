
package word.comparison;

import java.util.Scanner;

/**
 *
 * @author Jonathan Racioppo
 * This program is for IGN's code-foo.  It checks for two three letter words and then
 * calculates the steps required to get to the second word.
 * 
 * */

public class WordComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String origWord = "";
        String wordOne = "";
        String wordTwo = "";
        
        int step = 0;
        int ch = 0;
        
        //Ask for input
        System.out.println("Please type in a 3 letter word");
        wordOne = input.next();
        
        //Make sure the length of the word is correct
        if(wordOne.length() != 3)
        {
            System.out.println("Please type in only 3 letters");
            while(wordOne.length() != 3)
            {
                wordOne = input.next();
            }
        }
        //Set wordOne as the original word
        origWord = wordOne;
        
        //Ask for second word
        System.out.println("Please type in another 3 letter word");
        wordTwo = input.next();
        
        //Make sure the length of the word is correct
        if(wordTwo.length() != 3)
        {
            System.out.println("Please type in only 3 letters");
            while(wordTwo.length() != 3)
            {
                wordTwo = input.next();
            }
        }
        
        //Now compare the two 
        System.out.println("Your two words are : " + wordOne  + " and " + wordTwo);
        
        //Compare the strings
        while(wordOne.matches(wordTwo) == false)
        {
            //If the words match then break the loop
            if(wordOne.matches(wordTwo))
            {
                break;
            }
            if(wordOne.charAt(ch) == wordTwo.charAt(ch))
            {
                   //Dont add a step but go to the next letter
                   ch++;
            }
            else
            {
                wordOne = wordOne.replaceFirst(wordOne.substring(ch, 1 + ch), 
                        wordTwo.substring(ch, 1 + ch));
                System.out.println(wordOne); 
                
                //Don't go past the 3rd character
                if(ch <= 2)
                {
                    ch++;
                    step++;
                }
            }
            
        }
     System.out.println("It took " + step + " moves to change from " + origWord + " to " + wordTwo);
    }
}
