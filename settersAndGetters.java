import java.util.Scanner;
class settersAndGetters
{
     String playerName;
     public void setplayerName(String name)
     {
         playerName = name; // Name is set
     }

     public String getplayerName()
     {
         return playerName;
     }
     public void displayMessage()
     {
         System.out.printf("Dp's favourite basketball player ----> %s ",getplayerName());
     }
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        settersAndGetters sg = new settersAndGetters();
        sg.getplayerName(); // Intially it gives null as name is not set yet!
        System.out.println("Enter the player name:");
        String playername = sc.nextLine();
        sg.setplayerName(playername); //Set the playername using user's input
        // Method to display the output
        sg.displayMessage();
        
    }
}