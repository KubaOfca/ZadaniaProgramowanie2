import java.util.Scanner;

public class Zad3 {

    public static  void main(String[] arg)
    {

        Scanner in = new Scanner(System.in);

        String dna;

        dna = in.next();
        int[] tablica = new int[4];
        tablica = ZliczanieNukleotydow(dna);

        for (int i=0; i<4 ; i++)
        {
            System.out.print(tablica[i] +  " ");
        }
    }

    public static int[] ZliczanieNukleotydow(String dna)
    {
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
        return nukleotydy;

    }
}
