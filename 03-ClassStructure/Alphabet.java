public class Alphabet {
    public static boolean isAlphabet(String t){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int count=0;
        for(int i=1;i<t.length();i++){
            if(alphabet.indexOf(t.charAt(i-1))<=alphabet.indexOf(t.charAt(i))){
                count+=1;
            }
        }
        if(count==t.length()-1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));

    }
}
