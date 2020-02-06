public class MyPetsDriver
{
    public static void main(String[] args)
    {
        MyPets pablo = new Dog("Chihuahua", "Pablo", true, 5, 25.0, "kibble");
        MyPets tony = new Bird("Parrot", "Tony", false, 2, 10.0, "seeds");

        System.out.println("Pablo must be fed " + pablo.monthlyFeeding() + " times this month.");
        System.out.println("Tony must be feed " + tony.monthlyFeeding() + " times this month.");
    } // end method main
} // end class MyPetsDriver
