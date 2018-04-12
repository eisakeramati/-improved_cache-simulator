package AUT.CEIT.CA;

public class adress {

    private int score;
    private int number;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public adress(int number) {
        this.number = number;
        score = 0;
    }
}
