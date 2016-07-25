
package cointoss;

import java.util.Random;

public class CoinToss {
    
    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        return (toss==0) ? "Heads" : "Tails";
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
    
}
