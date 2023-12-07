public class Judge {
    int score;
    int[] validScores={1,2,3,4,5};

    public void assignScore(int value){
        this.score=value;
    }

    public Judge(int score){
        for(int i=0;i<validScores.length;i++){
            if(validScores[i]==score){
                this.score = score;
                break;
            }
        }
    }
}
