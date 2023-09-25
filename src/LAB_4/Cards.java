package LAB_4;

public class Cards {
    String ranks;
    String suits;

    public Cards(String ranks, String suits) {
        this.ranks = ranks;
        this.suits = suits;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",ranks,suits);
    }

}
