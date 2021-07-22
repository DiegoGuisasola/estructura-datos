import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        restalongnum();
    }
    public static void restalongnum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el vaor de N: ");
        String N = sc.nextLine();
        System.out.print("ingrese el valor de m: ");
        int m = sc.nextInt();
        int x = N.length()- m;
        System.out.println("el nuevo valor de N es:" + N.substring(0,x));

    }
}