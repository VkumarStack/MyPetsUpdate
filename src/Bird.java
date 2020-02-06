public class Bird extends MyPets
{
    private String species;

    //2) Constructor
    public Bird(String species, String name, boolean owner, int age, double weight, String food)
    {
        super(name, owner, age, weight, food);
        this.species = species;
    } // end constructor

    public int monthlyFeeding()
    {
        return 8;
    } // end method to detremine the number of feedings

    public String toString()
    {
        String output = super.toString();
        output += "\nSpecies: " + species;
        return output;
    } // end toString
} // end class Bird
