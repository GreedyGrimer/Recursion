package Projects.P2;

public class P2Score {

    int score = 0;
    int score2 = 0;


    public int scoring(double hp, double hp2) {
        if (hp > hp2) {
            System.out.println("Player 1 Wins!\n");
            score += 1;
        } else {
            System.out.println("Player 2 Wins!\n");
            score2 += 1;
        }

        System.out.printf("Player 1 Score:%d\nPlayer 2 Score:%d\n", score, score2);
        return score;


    } //scoring


        public void Win() {
            if (score > score2) {
                System.out.println("PLAYER 1 WINS THE BATTLE!");
            } else {
                System.out.println("PLAYER 2 WINS THE BATTLE!");
            }
        }




}


