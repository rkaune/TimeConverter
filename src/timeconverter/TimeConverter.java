/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package timeconverter;
import java.util.Scanner;
/**
 *
 * @author rkaune
 */
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void hoursToMins() {
        int hours, mins;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        hours = input.nextInt();
        input.close();

        mins = hours * 60;
        System.out.println("There are " + mins + " minutes in " 
                + hours + " hours.");
    }
    public static void daysToHours() {
        int days, hours;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        days = input.nextInt();
        input.close();

        hours = days * 24;
        System.out.println("There are " + hours + " hours in " 
                + days + " days.");
    }
    public static void minsToHours() {
        int hours, mins;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        mins = input.nextInt();
        input.close();

        hours = mins / 60;
        System.out.println("There are " + hours + " hours in " 
                + mins + " minutes.");
    }
    public static void hoursToDays() {
        int hours, days;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        hours = input.nextInt();
        input.close();

        days = hours / 24;
        System.out.println("There are " + days + " days in " 
                + hours + " hours.");
    }
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        /* Prompt user for type of conversion */
        System.out.println("1. Hours to minutes.");
        System.out.println("2. Days to hours.");
        System.out.println("3. Minutes to hours.");
        System.out.println("4. Hours to days.");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
                case 1: hoursToMins(); break;
                case 2: daysToHours(); break;
                case 3: minsToHours(); break;
                case 4: hoursToDays(); break;
        }
    }
    
}
