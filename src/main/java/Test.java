import java.util.Arrays;
import java.util.Scanner;

public class Test {

    static boolean[][] gen() {
        return new boolean[3][1];
    }

    static void show(boolean[][] world) {
        System.out.println(Arrays.toString(world));
    }

    public static void main(String[] args) {
        boolean[][] world = gen();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("hello");
        Scanner s = new Scanner(System.in);
        while (s.nextLine().length() == 0) {
            System.out.println();
            show(world);
        }
    }
}
