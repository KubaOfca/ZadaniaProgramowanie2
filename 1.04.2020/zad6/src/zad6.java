import java.util.Scanner;

public class zad6 {

    public static void main(String[] arg)
    {

        Scanner in = new Scanner(System.in);

        String dna1 = in.next();
        String dna2 = in.next();
        if(dna1.length() != dna2.length())
        {
            System.out.println("Blad! Podaj wyrazy tej samej dlugosci");

        }else
        System.out.println("Odleglosc Hamminga: " + Hamming(dna1, dna2));


    }

    public static int Hamming (String dna1, String dna2)
    {
        int hamming = 0;


        for(int i=0; i<dna1.length(); i++ )
        {
            if(dna1.charAt(i) != dna2.charAt(i))
            {
                hamming++;
            }
        }

        return hamming;
    }
}
