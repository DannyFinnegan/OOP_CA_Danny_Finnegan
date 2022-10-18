//Danny Finnegan T00225685
//S302
//18/10/22

package Assessment;

import java.util.Arrays;

public class Country {

    private String Name;
    private String Capital;
    private int Population;
    private int Area;
    private String[] Cities;
    private String Currency;
    private String Language;

    public Country(String Name, String Capital, int Population, int Area, String Currency, String Language) {
        setName(Name);
        setCapital(Capital);
        setPopulation(Population);
        setArea(Area);
        setCurrency(Currency);
        setLanguage(Language);
    }


    public String getName() {
        return Name;
    }

    public String getCapital() {
        return Capital;
    }

    public int getPopulation() {
        return Population;
    }

    public int getArea() {
        return Area;
    }

    public String[] getCities() {
        return Cities;
    }

    public String getCurrency() {
        return Currency;
    }

    public String getLanguage() {
        return Language;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public void setPopulation(int population) {
        if (population<0)
        {
            Population=0;
        }
        else
        {
            Population = population;
        }

    }

    public void setArea(int area) {
        Area = area;
    }

    public void setCities(String[] cities) {
        Cities = cities;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String toString() {
        return  "Name:" + Name +
                "\nCapital: " + Capital +
                "\nPopulation: " + Population +
                "\nArea: " + Area +
                "\nCities: " + Arrays.toString(Cities) +
                "\nCurrency: " + Currency +
                "\nLanguage: " + Language;
    }
}
