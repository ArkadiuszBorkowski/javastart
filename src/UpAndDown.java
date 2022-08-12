public class UpAndDown {
    //Inkrementacja i dekrementacja
    public static void main(String[] args) {
        int num = 3;
        // najpierw wyświetla, później zwiększa
        System.out.println(num++);
        System.out.println(num);
        // najpierw zwiększa, później wyświetla
        System.out.println(++num);
        System.out.println(num);
    }
}