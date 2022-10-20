package SpaceExample;

public class Main {
    public static void main(String[] args) {
      Spaceship spaceship =  new Spaceship("Nasa", 5, 20.0d, new Alien("Bob", 6.6d, 565d));

        System.out.println(spaceship);

        Spaceship clone1 = (Spaceship) spaceship.createClone();
        Spaceship clone2 = (Spaceship) spaceship.createClone();
        Spaceship clone3 = (Spaceship) spaceship.createClone();

        clone1.setName("Shawn");
        clone2.setName("Kyle");
        clone3.setName("Mikala");


        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);





    }
}
