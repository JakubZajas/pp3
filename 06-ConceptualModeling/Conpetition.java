import java.util.Arrays;

public class Conpetition{
    int[] playerScores;

        public float calculatePlayerResult(int[] scores) {
            float finalScore = 0;
            Arrays.sort(scores);

            for (int i = 1; i < scores.length - 1; i++) {
                finalScore += scores[i];
            }
            System.out.println("Player Final Result: " + finalScore / (scores.length - 2));
            return finalScore / (scores.length - 2);
        }

        public Conpetition(int[] playerScores) {
            this.playerScores = playerScores;
        }

        public static void main(String[] args) {
            Conpetition p1 = new Conpetition(new int[]{1, 2, 2, 4, 5});
            p1.calculatePlayerResult(p1.playerScores);
        }
    }