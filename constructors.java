class constructors
{
    String Value;
    //Constructors name should be same as class name
    public constructors()
    {
        //Empty Constructor
    }
    public constructors(String value)
    {
        // Parameterized constructor
        Value = value; //Initializing Value
    }
    public String getValue()
    {
        return Value;
    }
     public static void main(String args[])
    {
        constructors c = new constructors("THOR (LIGHTNING GOD)");
        System.out.printf("Favourite Marvel Hero------> %s ", c.getValue());
    }
}