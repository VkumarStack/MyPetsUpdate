public class Dog extends MyPets
{
    private String breed;

    //2) Constructor
    public Dog(String breed, String name, boolean owner, int age, double weight, String food)
    {
        super(name, owner, age, weight, food);
        this.breed = breed;
    } // end constructor

    public int monthlyFeeding()
    {
        int dailyFeedings;
        if (super.getAge() < 6)
        {
            dailyFeedings = 2;
        } // end if puppy
        else
        {
            dailyFeedings = 1;
        } // end else adult

        return dailyFeedings * 30;
    } // end method explaining how many feedings per month, for budgetary reasons

    public String toString()
    {
        String output = super.toString();
        output += "\nBreed: " + breed;
        return output;
    } // end toString
} // end class Dog
