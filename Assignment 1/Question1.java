import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number from the keyboard: ");
        int num=sc.nextInt();
        System.out.println("Given numnber: "+num);
        String binary=Integer.toBinaryString(num);
        System.out.println("Binary equivalent: "+binary);
        String octal=Integer.toOctalString(num);
        System.out.println("Octal equivalent: "+octal);
        String hexa=Integer.toHexString(num);
        System.out.println("Hexa equivalent: "+hexa);



    }

}
