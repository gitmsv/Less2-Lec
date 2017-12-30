/*
 * This Class )))
 */
package ua.jvlab.mslnk;

/**
 * @author: $.m.lnk
 * @version: 1.0.0
 * @date: 29.12.2017
 */
public class Runer {

    /**
     * @param args the command line arguments:
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rows = 9;
        int cols = 8;

            for (int i = 1; i <= rows; i += 1) {
            for (int j = 1; j <= cols; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
