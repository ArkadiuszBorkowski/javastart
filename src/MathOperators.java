public class MathOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        int sum = x + y;
        int sub = x - y;
        int multi = x * y;
        double div = x / (double)y;  //konwersja typu - rozszerzająca
        int mod = x % y;

        System.out.println("Liczba x = "+ x + " natomiast y = " + y);
        System.out.println("Wynik dodanania x + y = " + sum);
        System.out.println("Wynik odejmowania x - y = " + sub);
        System.out.println("Wynik mnożenia x * y = " + multi);
        System.out.println("Wynik dzielenia x / y = " + div);
        System.out.println("Reszta z dzielenia x przez y = " + mod);
    }
}

