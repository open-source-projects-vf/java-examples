import java.util.Arrays;
import java.util.Scanner;

public class Test {

    static boolean[][] gen() {
        return new boolean[3][1];
    }

    static void show(boolean[][] world) {
        System.out.println("show()");
    }

    public static void main(String[] args) {
        boolean[][] world = gen();
        Scanner s = new Scanner(System.in);
        while (s.nextLine().length() == 0) {
            System.out.println();
            show(world);
        }
    }
}
