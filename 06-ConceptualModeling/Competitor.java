public class Competitor {
    int[] score;

    public int calculateScore(int[] score){
        int finalScore=0;
        for(int j=1;j<score.length+1;j++){
            int v1=score[j-1];
            int v2=score[j];
            int temp=0;
            if(v1>v2){
                temp=v2;
                score[j]=v1;
                score[j-1]=temp;
            }
        }

        for(int i=1;i<score.length-1;i++){
            finalScore+=score[i];
        }

        return finalScore/(score.length-2);
    }
}
