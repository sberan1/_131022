public class Main {
    public static void main(String ... args) {
        Pet pet = new Pet();

        Owner standa = new Owner(1, "Standa",  'm');

        System.out.println(standa.toString());
        System.out.println(pet.toString());
    }
}