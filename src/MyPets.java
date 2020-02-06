public abstract class MyPets
{
    private final double LB_TO_KG = 0.454;
    private String name;
    private boolean hasOwner;
    private int age;
    private double weight;
    private String food;

    //2) constructor
    public MyPets(String name, boolean hasOwner, int age, double weight, String food)
    {
        this.name = name;
        this.hasOwner = hasOwner;
        this.age = age;
        this.weight = weight;
        this.food = food;
    } // end constructor

    public double lbsToKgs()
    {
        return weight * LB_TO_KG;
    } // end lbsToKgs

    abstract public int monthlyFeeding(); // to be overriden in child classes

    public String getName()
    {
        return name;
    } // end getName

    public boolean getHasOwner()
    {
        return hasOwner;
    } // end getHasOwner

    public int getAge()
    {
        return age;
    } // end getAge

    public double getWeight()
    {
        return weight;
    } // end getWeight

    public String getFood()
    {
        return food;
    } // end getFood

    //3) toString
    public String toString()
    {
        String output = "";
        output += "Name: " + name + "\nHasOwner: " + hasOwner;
        output += "\nAge: " + age + "\nWeight (in KG): " + lbsToKgs();
        output += "\nFood: " + food;
        return output;
    } // end toString
} // end class MyPets
