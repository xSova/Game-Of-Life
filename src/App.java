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

    public static String plural(int bruh) {
        String str = "";
        if (bruh == 1) {
            str = "cell";
        } else if (bruh == 0) {
            str = "cells";
        } else {
            str = "cells";
        };
        return str;
    };

    public static void gridSetting (int x, int y) {
        int numColumns = x;
        int numRows = y;
        System.out.println("The grid is: " + String.valueOf(numRows) + " " + plural(y) + " tall.");
        System.out.println("The grid is: " + String.valueOf(numColumns) + " " + plural(x) + " long.");
        };

    public static int getInput (int x) {
        int str;
        if (x == 1) {
            System.out.println("Width?");
            str = scnr.nextInt();
        } else {
            System.out.println("Height?");
            str = scnr.nextInt();
        };
        return str;
    };

    public static void main(String[] args) throws Exception {
        int[] dimensions = {getInput(1), getInput(2)};
        gridSetting(dimensions[0], dimensions[1]);
   }
}
