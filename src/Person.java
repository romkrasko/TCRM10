public class Person {

    private String name;
    private Pet pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void acquiringPet(Pet pet){
        this.pet=pet;
    }

    public void acquiringPet(String name){
        this.pet=pet;
        this.pet.name=name;
    }
}