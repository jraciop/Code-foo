
package high.score;

import java.util.Comparator;
/**
 *
 * @author Jonathan Racioppo
 * This class determines the order of scores
 */


public class ScoreComparator implements Comparator<Score> {
        public int compare(Score score1, Score score2) {

            float sc1 = score1.getScore();
            float sc2 = score2.getScore();

            if (sc1 > sc2){
                return -1;
            }else if (sc1 < sc2){
                return +1;
            }else{
                return 0;
            }
        }
}