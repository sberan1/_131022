import java.util.ArrayList;
import java.util.Objects;

public class Pet {
    private String color;
    private int numberOfLegs;
    private int age;
    private int weight;
    private char gender;
    private String type;

    public Pet(){
        color = "black";
        numberOfLegs = 4;
        age = 1;
        weight = 10;
        gender = 'm';
        type="dog";
    }

    public Pet(String color, int numberOfLegs, int age, int weight, char gender, String type) {
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", age=" + age +
                ", weight=" + weight +
                ", gender=" + gender +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return numberOfLegs == pet.numberOfLegs && age == pet.age && weight == pet.weight && gender == pet.gender && Objects.equals(color, pet.color) && Objects.equals(type, pet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, numberOfLegs, age, weight, gender, type);
    }
}
