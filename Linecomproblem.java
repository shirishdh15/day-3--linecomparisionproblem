package Linecomproblem;
import java.util.Scanner;
public class Linecomproblem {
    public static void length() {
        System.out.println("WELCOME TO LINE COMPARISION COMPUTATION PROGRAM");
        System.out.println("Enter the co-ordinates of line:");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        float len = (float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("length of the line: " +len);
    }
    public static void main(String[] args) {
        length();

    }
}
