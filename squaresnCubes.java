import java.util.Scanner;
class squaresnCubes
{
     public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num,range,squares,cubes;
        //Taking user input for 
        System.out.println("Enter the range:");
        range = input.nextInt();

        System.out.println("\nNumbers\t Squares Cubes");
        for(num = 0; num <= range ;num++)
        {
            squares = num * num;
            cubes = num * num * num;
            System.out.printf("%d\t %d\t %d \n",num,squares,cubes);
        }
    }
}