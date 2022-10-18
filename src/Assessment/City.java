//Danny Finnegan T00225685
//S302
//18/10/22

package Assessment;

public class City {
    private String Name;
    private int Population;
    private Location Location;

    public City(String Name, int Population, Location Location)
    {
        setName(Name);
        setPopulation(Population);
        setLocation(Location);
    }

    public String getName() {
        return Name;
    }

    public int getPopulation() {
        return Population;
    }

    public Assessment.Location getLocation() {
        return Location;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public void setLocation(Assessment.Location location) {
        Location = location;
    }
    public void GetDistanceBetween(float Distance)
    {
       // Math.sqrt();
    }

    public String toString() {
        return "\n\nName: " + Name + "\nPopulation: " + Population + "\nLocation: " + Location;
    }
}
