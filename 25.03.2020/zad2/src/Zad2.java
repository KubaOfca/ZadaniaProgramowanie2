import java.util.Scanner;

public class Zad2 {


    public static void main(String[] arg) {

        Scanner in = new Scanner(System.in);

        String dna;
        dna = in.next();
        String dnaKomplementarna = "";
        for (int j = 0; j < dna.length(); j++)
        {
            if((char)dna.charAt(j) == 'A')
            {
                dnaKomplementarna += "T";
            }else if((char)dna.charAt(j) == 'T')
            {
                dnaKomplementarna += "A";
            }else if((char)dna.charAt(j) == 'C')
            {
                dnaKomplementarna += "G";
            }else if((char)dna.charAt(j) == 'G')
            {
                dnaKomplementarna += "C";
            }
        }


        String dnaKomplementarnaOdwrocona = "";
        char dnaTmp; // zmienna przechowujaca znak A,T,C lub G poczawszy od konca Dna do poczatku Dna
        for(int i = 0; i<dna.length() ; i++ )
        {
            dnaTmp = (char)dnaKomplementarna.charAt(dnaKomplementarna.length()-i-1);
            dnaKomplementarnaOdwrocona += dnaTmp;

        }

        System.out.println(dnaKomplementarnaOdwrocona);


    }
}

