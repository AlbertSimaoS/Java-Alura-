public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            cachorro.fazerSom();
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
