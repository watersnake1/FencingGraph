/**
 * Created by Carol on 12/29/15.
 */
import java.util.Arrays;
public class Data {
    private String[] finishes;
    private String[] numPPL;
    private double[] percentiles;
    int counter;

    public Data() {
        finishes = new String[] {"11", "12", "7", "2", "18", "2", "5", "13", "3", "11", "21", "9", "3", "31", "11", "16",
        "3", "11", "15", "5", "6", "9", "8", "12", "94", "6", "10", "43", "5", "2", "10", "24", "13", "12", "12", "11"};
        numPPL = new String[] {"13", "19", "16", "5", "26", "11", "17", "21", "15", "18", "31", "12", "18", "35", "24",
        "26", "15", "50", "32", "38", "21", "20", "15", "77", "105", "45", "78", "66", "29", "34", "13", "37", "49", "45", "36", "37"};
        percentiles = new double[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0};
        counter = 0;
    }

    public void foo() {
        System.out.println(Arrays.asList(finishes).indexOf("11"));
    }


    public void percentileFinish() {
        for(String s: finishes) {
            percentiles[counter] = (double) Integer.parseInt(finishes[counter])/Integer.parseInt(numPPL[counter]);
            //System.out.println(percentiles[counter]);
            counter++;
        }
    }


    public void printLength() {
        System.out.println("finishes: " + finishes.length);
        System.out.println("numPPL: " + numPPL.length);
        System.out.println("percentiles: " + percentiles.length);
    }


    public int getFinishes() {return percentiles.length;}

    public double getPercentiles(int index) {
        return percentiles[index];
    }

}
