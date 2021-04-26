class classTest
{
    public void messageReport()
    {
        System.out.println("Message report arrived!");
    }
}

class classMain
{
        //creating method
        public void displayMessage()
        {
            System.out.println("Hello folks!");
        }
      
        public static void main(String args[])
        {
            classMain cm = new classMain();
            classTest ct = new classTest();
            
            cm.displayMessage();
            ct.messageReport();   
                     
        }
}
