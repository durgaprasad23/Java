import java.util.Scanner;
class methodParameter
{
    public void modelNo(String model)
    {
        System.out.printf("Honda %s! ",model); //Printf() is used to print values using format specifiers
    }    
     public static void main(String args[])
    {
        methodParameter mp =  new methodParameter();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the car model no:");
        String modelno = sc.nextLine();
        System.out.println();

        //Method calling with parameter
        mp.modelNo(modelno);
    }
}