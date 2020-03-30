import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Test {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String del = "[ .,?!'@_]+";
        String [] s1 = new String[400001];
        s1 = s.split( del);
        System.out.println(s1.length);
        for(int i=0; i<s1.length ; i++)
        {
            System.out.println(s1[i]);
        }
        scan.close();
    }
}
