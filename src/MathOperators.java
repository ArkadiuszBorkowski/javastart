public class MathOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        int sum = x + y;
        int sub = x - y;
        int multi = x * y;
        double div = x / (double)y;  //konwersja typu : rozszerzająca
        int mod = x % y;

        System.out.println("Liczba x = "+ x + " natomiast y = " + y);
        System.out.println("Wynik dodanania x + y = " + sum);
        System.out.println("Wynik odejmowania x - y = " + sub);
        System.out.println("Wynik mnożenia x * y = " + multi);
        System.out.println("Wynik dzielenia x / y = " + div);
        System.out.println("Reszta z dzielenia x przez y = " + mod + "\n"); // \n - nowa linia

        //operatory skróćone
        x += 5;
        System.out.println("\"operatory skrócone: x += 5\" :  x = " + x);

        x *= 3;
        System.out.println("\"operatory skrócone: x *= 3\" :  x = " + x);

        x /= 5;
        System.out.println("\"operatory skrócone: x /= 5\" :  x = " + x);

        x -= 2;
        System.out.println("\"operatory skrócone: x -= 2\" :  x = " + x);

        x %= 4;
        System.out.println("\"operatory skrócone: x %= 4\" :  x = " + x + "\n"); // \n - nowa linia


        //operatory porównania
        System.out.println("Czy X jest większę od Y? ---> " + x + " > " + y);
        System.out.println(x > y);

        System.out.println("Czy X jest różne od Y? --> -" + x + " != " + y);
        System.out.println(x != y);

        System.out.println("Sprawdzenie typu obiektu za pomocą instanceof:  boolean instance = \"Monika\" instanceof " +
                "java.lang.String;" );
        boolean instance = "Monika" instanceof java.lang.String;
        System.out.println(instance); // "Monika" to typ String
    }
}

