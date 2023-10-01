import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.events.EventException;
        //Each cell with one or no neighbors dies
        //Each cell with four or more neighbors dies
        //Each cell with two or three neighbors lives
        //Each space that is empty becomes populated if it has 3 neigbors
        //Create 2x 2D array with x,y values, inputted at the beginning of the game - default len/wid 10 -- this is current and future generation
        //Find starting positions, make randomly?
        //0 = dead 1 = alive
        //Using current generation, check for neigbors
        //Make changes to future generation based on current generation
public class App {
    public static Scanner scnr = new Scanner(System.in);
    public static void gridSetting (String x, String y) {
        int numColumns = Integer.parseInt(x);
        int numRows = Integer.parseInt(y);
        System.out.println("The grid is: " + String.valueOf(numRows) + " cells tall.");
        System.out.println("The grid is: " + String.valueOf(numColumns) + " cells long.");
        cell[] rowCells = {};
        };

    public static String getInput (Integer x) {
        String str = "";
        if (x == 1) {
            System.out.println("How many rows columns should there be?");
            str = scnr.nextLine();
        } else if (x == 2) {
            System.out.println("How many columns should there be?");
            str = scnr.nextLine();
        } else {
            System.out.println("Error, invalid input.");
        }
        return str;
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println("test");
   }
}
