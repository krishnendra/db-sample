package org.example;

import org.example.date.utils.Runner;

import java.util.Scanner;

/**
 * DB Calendar
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println("Enter Date Time in dd-mm-yyyy hh:mm:ss a  format :");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner. nextLine();

        //TODO Didn't get time to write Formatter
        Runner runner = new Runner();
        System.out.println(runner.execute(inputString));



    }
}
