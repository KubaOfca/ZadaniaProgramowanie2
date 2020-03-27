import java.util.Scanner;

public class Zad3 {

    public static  void main(String[] arg)
    {

        Scanner in = new Scanner(System.in);

        String dna;

        dna = in.next();

        int[] nukleotydy;
        nukleotydy = new int[4];

        for(int i=0 ; i<dna.length() ; i++)
        {
            if(dna.charAt(i)=='A')
            {
                nukleotydy[0]++;
            }
            else if(dna.charAt(i)=='C')
            {
                nukleotydy[1]++;
            }
            else if(dna.charAt(i)=='G')
            {
                nukleotydy[2]++;
            }
            else if(dna.charAt(i)=='T')
            {
                nukleotydy[3]++;
            }

        }

        for(int j=0 ; j<nukleotydy.length ; j++)
        {
            System.out.print(nukleotydy[j] + " ");
        }

    }
}
