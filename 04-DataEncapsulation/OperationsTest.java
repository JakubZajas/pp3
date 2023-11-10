
public class OperationsTest {
    public static void main(String[] args) {
        Operations T1 = new Operations("Have a nice day!");
        System.out.println(T1.Counter());
        System.out.println(T1.ShowCharacters(9));
        System.out.println(T1.EndsWith("day!"));
        System.out.println(T1.IsEmpty());
        System.out.println(T1.LastOccurence('e'));
        System.out.println(T1.Replace('-'));
        System.out.println(T1.UpperCase());
        
    }
}
