import java.util.Scanner;

public class reverseint {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(reverse(num));
        sc.close();
    }
    public static int reverse(int num){
        if (num>10) {
        System.out.print(num%10);
        // RECURSION CALL
        return reverse(num/10);
        }
        return num;
    }
}