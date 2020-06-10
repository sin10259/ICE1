
package pickacard;

/**sin10259
 * Gurkirat Singh
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String randomSuit(){
        int n;// stores the random number
        do{
           n=(int)(Math.random()*100);
        }while(n>3||n<0);
        return SUITS[n];
    }
    public int randomNumber(){
        int n;// stores the random number
        do{
           n=(int)(Math.random()*100);
        }while(n>13||n<1);
        return n;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", value=" + value + '}';
    }
   
   
    
}
