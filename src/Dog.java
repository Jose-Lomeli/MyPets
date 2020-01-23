public class Dog extends Pet
{
    private String breed;

    public Dog (String name, String breed, int age, double weight)
    {
        super(name, age, weight);
        this.breed = breed;
    }
    public String toString()
    {
        String output = super.toString() + "\nBreed: " + breed;
        return output;
    }


}
