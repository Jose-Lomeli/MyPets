public class Whale extends Pet
{
    private String species;

    public Whale (String name, String breed, int age, double weight)
    {
        super (name, age, weight);
        this.species = breed;
    }
    public String toString()
    {
        String output = super.toString() + "\nSpecies: " + species;
        return output;
    }//end to string with call super


}
