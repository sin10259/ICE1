package pickacard;
 
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @author Paul Bonenfant
 */
import java.util.*;
public class CardTrick {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        String suit;
        int number;
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            suit=c.randomSuit();// suit between 1-4
            number=c.randomNumber();//number between 1-13
            c.setSuit(suit);
            c.setValue(number);
            magicHand[i]=c;
            System.out.println(magicHand[i].getSuit()+"  "+magicHand[i].getValue());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        int value;// stores the value entered by the user
        String s;//stores the suit entered by the user
        System.out.print("Enter the Suit");
        s=sc.next();
        System.out.print("Enter the value");
        value=sc.nextInt();
        int result=0;//helps to get out of te loop quickly
        for(int i = 0; i < magicHand.length; i++){
            if(value == magicHand[i].getValue()){
                if(s.compareTo(magicHand[i].getSuit())==0){
                    result=1;
                    break;
                }
            }
        }
        if(result==1)
            System.out.println("Your card is in the Array");
        else
            System.out.println("Your card is not in the Array");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
