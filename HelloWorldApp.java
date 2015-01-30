/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author Jared Beagley
 */
public class HelloWorldApp {
    //import java.io.BufferedReader;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        int num = args.length;
        System.out.println("You have " + num + " args");
        
        for (int i = 0; i < args.length; i++)
        {
          System.out.print(args[i] + " ");
        }
        for (String arg : args){
            System.out.print(arg + " ");
        }
        System.out.println("Hello Everyone, my name is Jared Beagley, and this is my first ever java app!");
        int i = 3;
        int j = 7;
        int k = i + j;
        System.out.println(i + " + " + j + " = " + k);
        if (i == j)
        {
         System.out.println(i + " and " + j + " are the same number!");
        }
        else
        {
         System.out.println(i + " and " + j + " are not the same number!");
        }
        boolean same = false;
        int z = 0;
        while(!same)
        {
            if (z != j)
            {
             System.out.println(z + " is not equal to " + j + "!");
            }
            else
            {
             System.out.println(z + " is equal to " + j + "!");
             same = true;
            }
            z++;
        }
        
    }
}
    

