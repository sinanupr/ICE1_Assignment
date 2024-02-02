/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier anupreetsingh
 * 991720106
 * 2/2/2024
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // Fill magicHand with random cards
        Random random = new Random();
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(Card.SUITS.length)]);
            magicHand[i] = c;
        }

        // Hardcoded luck card
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit("Clubs");
        magicHand[6] = luckCard;

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter your card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();

        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search for the match in magichand
       boolean foundLuckyCard = false;
       for (Card card : magicHand) {
        if (card.getValue() == luckCard.getValue() && card.getSuit().equalsIgnoreCase(luckCard.getSuit())) {
        foundLuckyCard = true;
         break;
    }
}

    // Report the result
    if (foundLuckyCard) {
    System.out.println("Congratulations! You have the lucky card.");
    } else{
    System.out.println("Sorry, the lucky card is not in the magic hand.");
    }
    }
}
    


