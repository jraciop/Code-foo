
package high.score;
import java.io.Serializable;
/**
 *
 * @author Jonathan
 */
public class Score  implements Serializable {
    private float score;
    private String naam;

    public float getScore() {
        return score;
    }

    public String getNaam() {
        return naam;
    }

    public Score(String naam, float score) {
        this.score = score;
        this.naam = naam;
    }
}