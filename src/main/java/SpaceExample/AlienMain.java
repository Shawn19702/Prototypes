package SpaceExample;

public class AlienMain {
    public static void main(String[] args) {
        Alien alien = new Alien("Mikala", 6.6d, 500d);

      Alien clone1 =  (Alien) alien.createClone();
        Alien clone2 =  (Alien) alien.createClone();
        Alien clone3 =  (Alien) alien.createClone();
        Alien clone4 =  (Alien) alien.createClone();

        clone1.setName("john1");
        clone2.setName("john2");
        clone3.setName("john3");
        clone4.setName("john4");

        System.out.println(alien);
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);






    }









    }

