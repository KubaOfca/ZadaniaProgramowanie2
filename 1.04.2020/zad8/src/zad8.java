import java.util.Random;
import java.util.Scanner;

public class zad8 {

    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        System.out.print("k: ");
        int k = in.nextInt();
        System.out.print("m: ");
        int m = in.nextInt();
        System.out.println("wynik: " + SmiertelneKroliki(n, k, m));

    }

    public static int SmiertelneKroliki(int n, int k, int m)
    {
        int iloscSamcow = 1;
        int iloscSamic = 1;
        int pary = 1;
        int[][] smierc = new int[2][m+1]; // tablica, w ktroej przechowywane sa dane o ilosci powstalych samcow i samic
                                          // w danej iteracji. Dane sa przechowywane co okres, czyli co "m" a nastepnie
                                          // nadpisywane nowymi wartosciami
        smierc[0][0] = 1; // samiec
        smierc[1][0] = 1; // samica


        for(int i=1; i<=n; i++)
        {
            // odjecie martwych krolikow
            if(i>2 && (i%(m+1)==0))
            {

                iloscSamcow -= smierc[0][0];
                iloscSamic -= smierc[1][0];

            }
            if(i>2 && (i%(m+1)==1))
            {

                iloscSamcow -= smierc[0][1];
                iloscSamic -= smierc[1][1];

            }
            if(i>2 && (i%(m+1)==2))
            {

                iloscSamcow -= smierc[0][2];
                iloscSamic -= smierc[1][2];

            }


            int ctrSamiec = 0; // liczba meskich potomkow w danej iteracji
            int ctrSamica = 0; // liczba zenskich potomkow w danej iteracji

            // okreslanie ilosci par zdolnych do rozrodu
            if(iloscSamcow > iloscSamic)
            {
                pary = iloscSamic;

            }else if(iloscSamcow < iloscSamic)
            {
                pary = iloscSamcow;
            }else if(iloscSamcow == iloscSamic)
            {
                pary = iloscSamcow; // wartosci sa takie same wiec nie ma znaczenia czyja wartosc, samic czy samcow, podstawimy
            }

            //losowosc plci potomkow
            for(int j=0; j<k*pary; j++)
            {
                Random rand = new Random(); // true SAMIEC false SAMICA
                boolean los = rand.nextBoolean();

                if(los == true)
                {
                    iloscSamcow++;
                    ctrSamiec++;

                }else if(los == false)
                {
                    iloscSamic++;
                    ctrSamica++;
                }
            }

            smierc[0][i%(m+1)] = ctrSamiec;
            smierc[1][i%(m+1)] = ctrSamica;

        }

        return iloscSamcow + iloscSamic;
    }
}
