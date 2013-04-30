package wordsearch;

/**
 *
 * @author Jonathan Racioppo
 * This is a basic word-search program for IGN's code-foo.  It checks for every word 
 * and when it's found the program moves on to the next word.  The user is notified
 * with each word found.
 */

public class WordSearch {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Keep track of the word count and character number
        int nextWord = 1;
        int charNum = 0;
        
        //String and characters to hold all the data
        String wordPuzzle;
        String currWord = "h e a l t h";
        String revWord;
        char currChar = currWord.charAt(charNum);
        char nextChar = currWord.charAt(charNum + 2);
        char lastChar = currWord.charAt(currWord.length() - 1);
        
        //A bool to use when we have not yet found the word
        boolean foundIt = false;
        
        wordPuzzle = "x n t g j h e a l t h u s k b w a s t a\n"
                + "s o u j y n z w x b t g m v y b o l a h\n"
                + "h t i l t s l e q d c r a n d r p x z b\n"
                + "p s h e p b n o r e b a z o o k a s b u\n"
                + "l i d n o l y p r v a s j p p j o s r d\n"
                + "i e v y r u m g b e l s g r y l h c x z\n"
                + "a h m h o n k i l l t a c u l a r o b y\n"
                + "b o i e q d o n s y b s o t x o g r a p\n"
                + "h o w i t e u z a t y s e d o b f e v s\n"
                + "a i s c a r k a e i d i s i c h i o p t\n"
                + "o d b a d b o h d r y n y l e v e l a e\n"
                + "l d k u i u j i r e g s d a s q a b g v\n"
                + "d i u c b s t a d l k l h y a s p i l e\n"
                + "v o j c i s h j g o d y o o m g o l d s\n"
                + "w r i l k d b g l a y i r i s t g x g m\n"
                + "l t s c r a g a h d e s d q b a h w d o\n"
                + "h e a l t i r n o f u y e a l w y e h m\n"
                + "f m u s h r o o m e h a p p i n d r t o\n"
                + "l h f h p y o n u k a c o l a o r e b v\n"
                + "p a r e l z d d k a p r o t o m a n p l\n"
                + "m j o p o u y o m l q u a l i n l d w y\n"
                + "w a p a n y r r r j y o a h z n i x e m\n"
                + "m l s r i w h f t i n o g r o l s e y s\n"
                + "l y l d n i k u o y d l u o w u k d e o\n"
                + "o y o q y a k d j e b l u n d e r s c u\n";
        
        //Record the place we found the character so we have something to work off of
        int currPos = wordPuzzle.indexOf(currChar, 0);
        int nextPos = wordPuzzle.indexOf(nextChar, 0);
        
        //Show the word puzzle before we start
        System.out.println(wordPuzzle);

        //Lets start the main program loop
        do
        {
            //Create a StringBuilder for the reverse of a word
            StringBuilder sb = new StringBuilder(currWord).reverse();
            
            //Convert back to a String
            revWord = sb.toString();
            
            
            //Loop for word searching
            for(int i=0;i <= (wordPuzzle.length() - currWord.length()); i++)
            {
                //Check the word from left to right
                if(wordPuzzle.regionMatches(i, currWord, 0, currWord.length()))
                {
                    foundIt = true;
                    nextWord += 1;
                    System.out.println(currWord + " found.");
                    break;
                }
                //Now check from right to left
                else if(wordPuzzle.regionMatches(i, revWord, 0, currWord.length()))
                {
                    foundIt = true;
                    nextWord += 1;
                    System.out.println(currWord + " found.");
                    break;
                }
            }
            
            //Get the next word ready
            switch (nextWord)
            {
                
                case 1: 
                    currWord = "h e a l t h";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 2:
                    currWord = "s c o r e";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 3:
                    currWord = "z e r g";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 4:
                    currWord = "a s s a s s i n";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 5:
                    currWord = "r e l o a d";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 6:
                    currWord = "p y l o n";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 7:
                    currWord = "l e v e l";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 8:
                    currWord = "b a z o o k a";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 9:
                    currWord = "k i l l t a c u l a r";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 10:
                    currWord = "h e i s t";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 11: 
                    currWord = "d u c k";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 12:
                    currWord = "h a l o";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 13:
                    currWord = "m u s h r o o m";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 14:
                    currWord = "h o r d e";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 15:
                    currWord = "g a n o n d o r f";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 16:
                    currWord = "p r o t o m a n";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 17:
                    currWord = "h y d r a l i s k";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 18:
                    currWord = "s h e p a r d";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 19:
                    currWord = "n u k a c o l a";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 20:
                    currWord = "p l a s m i d";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 21:
                    currWord = "w o u l d y o u k i n d l y";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 22:
                    currWord = "m e t r o i d";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 23:
                    currWord = "x i n z h a o";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                case 24:
                    currWord = "b l u n d e r b u s s";
                    if(foundIt == true)
                    {
                        currChar = currWord.charAt(charNum);
                        nextChar = currWord.charAt(charNum + 2);
                        lastChar = currWord.charAt(currWord.length() - 1);
                    }
                    break;
                default:
                    //This should never occur but its a failsafe
                    System.out.println("All 24 words have been found!");
                    nextWord = 25;
                    break;
            }
            
            //We didnt find the string of the word, so we have to find it character by character
            if(nextPos == currPos + 40 || nextPos == currPos - 40
                    || nextPos == currPos + 38 || nextPos == currPos -38
                    || nextPos == currPos + 42 || nextPos == currPos - 42)
            {   
    
                if(charNum >= currWord.indexOf(lastChar))
                {
                    //Dont add to it
                }
                else
                {
                    //We have not found the full word yet but move on to the next character in the string
                    foundIt = false;
                    charNum += 2;
                    currChar = currWord.charAt(charNum);
                }

                if(currChar == lastChar)
                {
                    //We found every character in the word
                    nextWord += 1;
                    charNum = 0;
                    foundIt = true;
                    System.out.println(currWord + " found.");
                }
            }
            //This will loop through if the characters dont match the full word
            else
            {
                //Look for the next instance of the currChar
                for(int c=0; c < wordPuzzle.length(); c++)
                {
                    if(wordPuzzle.charAt(c) == currChar)
                    {
                        currPos = wordPuzzle.indexOf(currChar, currPos+1);
                        nextPos = wordPuzzle.indexOf(nextChar, nextPos+1);
                    }
                }
            }
            
        }while(nextWord < 25);
    //Let the user know that every word has been found in the word-search
    System.out.println("24 words have been found!");
    }
    
}
