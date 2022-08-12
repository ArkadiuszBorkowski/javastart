import java.util.Scanner;

public class MathOperatorsHomoework2 {
    public static void main(String[] args) {

        final double vat = 0.23;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwotę netto towaru:");
        double netto = scanner.nextDouble();
        double varAmount = netto * vat;
        double brutto = netto + varAmount;

        System.out.println("Kwota brutto wynosi "+ brutto + "zł, z czego " +varAmount + "zł stanowi podatek Vat");

    }

}
