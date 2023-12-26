
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------");
        Scanner input = new Scanner(System.in);
        Stack x = new Stack();
        while (true) {
            System.out.println("1 - add");
            System.out.println("2 - remove");
            System.out.println("3 - top");
            System.out.println("4 - pop");
            System.out.println("5 - print");
            System.out.println("0 - exit");
            System.out.print("option: ");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    return;
                case 1:
                    System.out.print("data: ");
                    String b = input.next();
                    x.push(b);
                    break;
                case 2:
                    x.remove();
                    break;
                case 3:
                    System.out.println("top: " + x.top.data);
                    break;
                case 4:
                    System.out.println("pop: " + x.pop().data);
                    break;
                case 5:
                    x.print();
                    break;
                default:
                    break;
            }
            System.out.println("--------------------");
        }

    }

}
