/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.da.Practice1;

import com.leapfrog.da.Practice1.util.AddCommand;
import com.leapfrog.da.Practice1.util.Calculator;
import com.leapfrog.da.Practice1.util.CalculatorFactory;
import com.leapfrog.da.Practice1.util.SubtractCommand;

/**
 *
 * @author Dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double x = 10, y = 2;
        int ch=3;
        Calculator calc= CalculatorFactory.get(1);
        System.out.println(calc.calculate(x,y));
    }
}
