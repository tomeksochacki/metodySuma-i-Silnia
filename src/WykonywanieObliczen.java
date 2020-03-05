import java.util.Scanner;

public class WykonywanieObliczen {
    public static void main(String[] args) {
        System.out.println("Podaj licznę nauralną, całkowitą - do obliczenia silni");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        System.out.println("Silnia z podanej liczby wynosi " + Obliczenia.silnia(s));

        int[] tablica = {32, 2, 1, 1};

        System.out.println("Suma liczb z tablicy wynosi: " + Obliczenia.sumujLiczby(tablica));
    }
}
