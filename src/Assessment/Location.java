//Danny Finnegan T00225685
//S302
//18/10/22

package Assessment;

public class Location {
    private double Latitude;
    private double Longitude;

    public Location(double Latitude,double Longitude)
    {
        setLatitude(Latitude);
        setLongitude(Longitude);
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public String toString() {
        return "\nLatitude " + Latitude + "\nLongitude " + Longitude;
    }
}
