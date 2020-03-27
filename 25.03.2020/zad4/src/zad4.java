import java.util.Scanner;

public class zad4 {

    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();

        System.out.println("podciag: " + LongestCommonSubstring(word1, word2));

    }

    public static String LongestCommonSubstring(String word1, String word2)
    {
        String change = " ";

        if(word1.length() < word2.length())
        {
            change = word1;
            word1 =  word2;
            word2  = change;
        }

        String tmp = "";
        String finalsubstring = "";
        boolean flaga = false;
        int remeberI = 0;

        for(int i=0; i < word1.length() ; i++)
        {
            for(int j=0 ; j < word2.length() ; j++)
            {
                if(word1.charAt(i) == word2.charAt(j))
                {
                    if(flaga == false)
                    {

                        remeberI = i+1;
                        if(remeberI == word1.length())
                        {
                            remeberI = i;
                        }

                    }

                    tmp += word2.charAt(j);

                    if(i+1 < word1.length())
                    {
                        i++;
                    }

                    flaga = true;

                }
                else if(word1.charAt(i)!= word2.charAt(j) && flaga == true)
                {
                    flaga = false;

                    i = remeberI;

                    if(tmp.length() > finalsubstring.length())
                    {
                        finalsubstring = tmp;
                    }
                    tmp = "";

                }


            }

            if(flaga == true)
            {
                flaga = false;
                i = remeberI;

                if(tmp.length() > finalsubstring.length())
                {
                    finalsubstring = tmp;
                }

                tmp = "";

            }

        }
       return  finalsubstring;
    }

}


