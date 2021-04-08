import java.util.Scanner;
class simpleCalculator
{
     public static void main(String args[])
    {
        int num1,num2,result;
        char operator;
          Scanner input = new Scanner(System.in);
        //Taking inputs from user
        System.out.println("Enter first number:");
            num1 = input.nextInt();
        System.out.println("Enter second number:");
            num2 = input.nextInt();
        // Select any operator to perform calculations
        System.out.println("Choose any operator: \n + \n - \n % \n * \n ");
           // To take symbol as input you need to use charAt() with arguments  
            operator = input.next().charAt(0);

              if(operator == '+')
              { 
                  result = num1 + num2;
                  System.out.printf("Sum is: %d %c %d = %d",num1,operator,num2,result);
              } 
              else if(operator == '-')   
              {
                  result = num1 - num2;
                  System.out.printf("Difference is: %d %c %d = %d",num1,operator,num2,result); 
              }
              else if(operator == '*') 
              {
                  result = num1 * num2;
                  System.out.printf("Multiplication is: %d %c %d = %d",num1,operator,num2,result);
              }
              else if(operator == '%')
              {
                  result = num1 % num2;
                  System.out.printf("Division is: %d %c %d = %d",num1,operator,num2,result);
              }
              else
              {
                  System.out.printf("Choose a valid operation");
              }
    }
}
