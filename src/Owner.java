import java.util.ArrayList;
import java.util.Objects;

public class Owner {
    private int age;
    private String name;
    private char gender;
    private ArrayList<Pet> pets;

    public Owner(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.pets = new ArrayList<Pet>();
        pets.add(new Pet());
        pets.add(new Pet("white",3,100,5,'m',"cat"));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public ArrayList<Pet> getPets() {
        return (ArrayList<Pet>)pets.clone();
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", pets=" + pets +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return age == owner.age && gender == owner.gender && Objects.equals(name, owner.name) && Objects.equals(pets, owner.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender, pets);
    }
}
