import java.util.Scanner;

public class zad7 {

    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wartosc n: ");
        int n = in.nextInt();
        System.out.print("Podaj wartosc k: ");
        int k = in.nextInt();

        System.out.println("Liczba krolikow po n iteracjach: " + NiesmiertelneKroliki(n, k));


    }

    public static int NiesmiertelneKroliki (int n, int k)
    {
        int wynik = 2; // zadeklarowana wartosc "2" poniwaz na poczatku mamy 2 kroliki
        int iloraz = 0; // ilosc par biorących udział w rozrodzie podczas jednej iteracji
        for(int i=1 ; i<=n ; i++)
        {
            iloraz = wynik / 2;
            wynik += k*iloraz;

        }
        return wynik;
    }



}
