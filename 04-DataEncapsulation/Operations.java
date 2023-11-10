public class Operations {
    String word;
    
    public Operations(String word) {
        this.word = word;
    }

    public int Counter(){
        int count=0;
        for(int i=0;i<word.length();i++){
            count+=1;
        }
        return count;
    }

    public String ShowCharacters(int count){
        return word.substring(0,count);
    }

    public boolean EndsWith(String phrase){
        return word.endsWith(phrase);
        }
    
    public boolean IsEmpty(){
        return word.isEmpty();
    }

    public int LastOccurence(char letter){
        return word.lastIndexOf(letter);
    }

    public String Replace(char value){
        return word.replace(' ',value);
    }
    public String UpperCase(){
        return word.toUpperCase();
    }
}

