public class Obliczenia {

    public static int silnia(int liczba){
        int s = 1;
        for (int i = 1; i <=liczba; i++){
            s = s*i;
        }
        return s;
    }

    public static int sumujLiczby(int[]tab){
        int suma = 0;
        for(int i:tab) {
            suma += i;
        }
        return suma;
    }

}
