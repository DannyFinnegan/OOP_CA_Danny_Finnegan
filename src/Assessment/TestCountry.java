//Danny Finnegan T00225685
//S302
//18/10/22

package Assessment;
import javax.swing.*;

public class TestCountry {


    public static void main(String[] args) {
        Country C1=new Country("Ireland","Dublin",4904000,70273,"euro","English");
        City Ci1 =new City("Cork", 124391, new Location(51.8985, 8.4756));
        City Ci2 =new City("Galway", 79934, new Location(53.2707, 9.0568));
        City Ci3 =new City("Dublin", 544107, new Location(53.3498, 6.2603));
        City Ci4 =new City("Limerick", 194899, new Location(52.6638, 8.6267));
        City Ci5 =new City("Waterford", 53504, new Location(52.2593, 7.1101));

        String output = "";

        output+= C1.toString();
        output+= Ci1.toString();
        output+= Ci2.toString();
        output+= Ci3.toString();
        output+= Ci4.toString();
        output+= Ci5.toString();

        JOptionPane.showMessageDialog(null, output, "Country",JOptionPane.INFORMATION_MESSAGE);


    }
}
