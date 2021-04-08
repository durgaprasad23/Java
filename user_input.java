import java.util.Scanner;
class user_input
{
     public static void main(String args[])
    {
          Scanner input = new Scanner(System.in);
          int num1;
          int num2;
          int result;

            // Taking user input 1
            System.out.println("Enter input 1:");
             num1 = input.nextInt();
            //Taking user input 2
            System.out.println("Enter input 2:");
             num2 = input.nextInt();

            //  result = num1 * num2;
            result = (num1 + (num1 * num2)/5);
            // Displaying result
            System.out.printf("Result is:%d",result);

    }
}