import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class zad5 {

    public static void main (String[] arg)
    {

        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();

        System.out.println("Najdluzszy podlancuch: " + LongestCommonSubsequence(word1,word2));



    }

    public static String LongestCommonSubsequence(String word1, String word2)
    {

        String finalword = ""; // podciag

        boolean flaga = true;
        int[] indexs = new int[word2.length()]; // tablica indeksow drugiegow slowa w celu
        int rememberJ = 0; // pamietanie ostatniego miejsca wystapenia iteratora j,
        int ctr=0; // iterator tablicy indexs

        for(int p=0; p<word2.length(); p++)
        {
            indexs[p] = -2; // wypelnienie tablicy neutralnymi indeksami
        }


        for(int i=0; i< word1.length(); i++)
        {

            for(int j=rememberJ; j< word2.length(); j++)
            {

                flaga = true;

                if(word1.charAt(i) == word2.charAt(j))
                {
                    for(int k=0; k<word2.length() ; k++)
                    {
                        if(word2.indexOf(word2.charAt(j), j) == indexs[k])
                        {
                            flaga = false;

                        }
                    }
                    if(flaga == true)
                    {

                        finalword += word1.charAt(i);
                        rememberJ = j;
                        indexs[ctr] = word2.indexOf(word2.charAt(j),j); // zapamietanie indeksu
                        ctr++;
                        break;

                    }

                }
            }
        }
        return finalword;



    }

}
