package LAB_4;

public class Player {

    String player1[] = new String[13];
    String player2[] = new String[13];
    String player3[] = new String[13];
    String player4[] = new String[13];



    public void distribution (String[] cards){
        for (int i = 0; i < 13; i++) {

            player1[i]= cards[i];
            player2[i]= cards[i +13];
            player3[i]= cards[i +26];
            player4[i]= cards[i +39];


        }

        System.out.println("Player 1 cards :");
        for (int i = 0; i < 13; i++) {
            System.out.println(player1[i]);
        }
        System.out.println("Player 2 cards :");
        for (int i = 0; i < 13; i++) {
            System.out.println(player2[i]);
        }
        System.out.println("Player 3 cards :");
        for (int i = 0; i < 13; i++) {
            System.out.println(player3[i]);
        }
        System.out.println("Player 4 cards :");
        for (int i = 0; i < 13; i++) {
            System.out.println(player4[i]);
        }



    }


}