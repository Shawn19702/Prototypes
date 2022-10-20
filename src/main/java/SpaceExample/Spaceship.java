package SpaceExample;

public class Spaceship implements Prototype{
    private String name;
    private  Integer crew;
    private  Double fuel;
private Alien captain;

    public Spaceship(String name, Integer crew, Double fuel, Alien captain) {
        this.name = name;
        this.crew = crew;
        this.fuel = fuel;
        this.captain = captain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCrew() {
        return crew;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Alien getCaptain() {
        return captain;
    }

    public void setCaptain(Alien captain) {
        this.captain = captain;
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", fuel=" + fuel +
                ", captain=" + captain +
                '}';
    }

    @Override
    public Prototype createClone() {
        return new Spaceship(name, crew, fuel,(Alien) captain.createClone());
    }
}
