/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration;

import java.io.Console;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Güney
 */
public class Iteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        double res = 0;
        double seed = 0;
        int upto = 0;

        Console c = System.console();
        String stimes = c.readLine("Enter times:");
        String sseed = c.readLine("Enter seed:");
        seed = Integer.parseInt(sseed);
        upto = Integer.parseInt(stimes);

        for (int i = 1; i <= upto; i++) {
            res = takePower(i, seed);
            System.out.println("Iteration " + i + " Result = " + takePower(i, seed));
            System.out.println("New version...");
        }

    }

    public static double takePower(int times, double seed) {
        double res = 0;

        if (times == 1) {
            res = Math.pow(seed, 2);
        } else {
            res = Math.pow(takePower(times - 1, seed), 2);
        }

        return res;
    }

}
