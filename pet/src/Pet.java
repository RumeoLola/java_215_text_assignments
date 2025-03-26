class Pet {
    private String name;
    private String species;
    private String mood;

    public Pet(String name, String species, String mood) {
        this.name = name;
        this.species = species;
        this.mood = mood;
    }

    // write your code here
    @Override
    public String toString()    {
        return name + "-" + species + "-" + mood;
    }
}