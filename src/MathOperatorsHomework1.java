/* Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich dowolne liczby,
a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:

Czy x jest większe od y?
Czy x pomnożone przez 2 jest większe od y?
Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo) */

import java.util.Random;

public class MathOperatorsHomework1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int numberX = rand.nextInt(10); //liczba z przedziału 0-9
        int numberY = new Random().nextInt(10);
        boolean result;

        System.out.println("Liczba x = " + numberX);
        System.out.println("Liczba y = " + numberY);
        result = numberX > numberY;
        System.out.println("Czy x jest większe od y? =" + result);

        result = numberX *2 > numberY;
        System.out.println("Czy x pomnożone przez 2 jest większe od y? =" + result);

        result = (numberY < numberX +3) && (numberY > numberX -2);
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? =" + result);

        result = (numberX * numberY) % 2 == 0;
        System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)? = " + result);


    }


}
