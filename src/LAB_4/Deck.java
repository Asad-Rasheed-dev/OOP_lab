package LAB_4;

public class Deck {
    String suits[]= {"Diamonds", "spades","Hearts","Clubs"};
    String ranks[]= {"Ace","2","3","4","5","6","7","8","9","10","Jack","king","Queen"};
    Cards cards[] = new Cards[52];


    Deck() {
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j= 0;j < 13;j++){
                cards[counter++]=new Cards(ranks[j],suits[i]);
            }


        }

    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 52; i++) {
            str.append(cards[i]+"\n");
        }
        return str.toString();
    }
}
