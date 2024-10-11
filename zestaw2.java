import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class zestaw2 {
    public static void main(String[] args) {
        //zad1
        System.out.println(((Object)(23.0 + 76)).getClass().getSimpleName());
        System.out.println(((Object)(41*2.0+3)).getClass().getSimpleName());
        System.out.println(((Object)(5-33)).getClass().getSimpleName());
        System.out.println(((Object)(109%3)).getClass().getSimpleName());
        System.out.println(((Object)(50/2)).getClass().getSimpleName());
        System.out.println(((Object)(4 | 2)).getClass().getSimpleName());
        System.out.println(((Object)(3^5)).getClass().getSimpleName());
        System.out.println(((Object)(7&9)).getClass().getSimpleName());

        //zad2
        double wynik = (Math.sqrt(7) - 1) / 2 + Math.pow(3, 3) % 2;
        int rzutowanyWynik = (int)wynik;
        System.out.println("Rzutowany wynik: " + rzutowanyWynik);

        int rokurodzenia = 2003;
        int dzienurodzenia = 20;
        int miesiacurodzenia = 11;
        double wynik2 = (double) rokurodzenia / (dzienurodzenia * miesiacurodzenia);
        int rzutowanywynik2 = (int)wynik2;
        System.out.println("Rzutowany wynik2: "+ rzutowanywynik2);

        int a = 2;
        int b = 3;
        int c = 4;
        double wynik3 = a%b%c;
        int rzutowanywynik3 = (int)wynik3;
        System.out.println("Wynik3: " + rzutowanywynik3);

        int nazwisko = 9;
        int imie = 7;
        double wynik4 = nazwisko%imie + 1 /(Math.pow((0.25), 2));
        System.out.println("Wynik: " + wynik4);

        //zad3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String slowo1 = scanner.next();
        System.out.println("Podaj nazwisko: ");
        String slowo2 = scanner.next();
        System.out.println("Twoje imie i nazwisko: "+ slowo1 +" "+ slowo2);


        //zad4

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj pierwsza oraz druga liczbe: ");
        int liczba1 = scanner2.nextInt();
        int liczba2 = scanner2.nextInt();
        int suma = liczba1 + liczba2;
        int roznica = liczba1 - liczba2;
        int iloczyn = liczba1 * liczba2;
        double iloraz = liczba1/liczba2;
        System.out.println("Suma: "+suma);
        System.out.println("roznica: "+roznica);
        System.out.println("iloczyn: "+iloczyn);
        System.out.println("Iloraz: "+iloraz);

        //zad5
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj liczbe pls: ");
        double liczba3 = scanner3.nextInt();
        System.out.println("Wynik: " + (liczba3 + 140));
        System.out.println("Wynik: " + (liczba3 - 31));
        System.out.println("Wynik: " + (liczba3 * 7));
        System.out.println("Wynik: " + (liczba3 / 13));
        System.out.println("Wynik: " + (liczba3 % 7));
        System.out.println("Wynik: " + ((int)liczba3 / 4));
        System.out.println("Wynik: " + (Math.pow(45, liczba3)));
        System.out.println("Wynik: " + ((int)liczba3 & 67));
        System.out.println("Wynik: " + ((int)liczba3 | 59));
        System.out.println("Wynik: " + ((int)liczba3 ^ 23));
        System.out.println("Wynik: " + ((int)liczba3 << 5));
        System.out.println("Wynik: " + ((int)liczba3 >> 6));


    }
}