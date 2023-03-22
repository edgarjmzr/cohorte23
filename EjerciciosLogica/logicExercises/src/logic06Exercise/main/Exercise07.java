package logic06Exercise.main;

import java.util.Scanner;

// Must ask the user a day of the week (from Monday to Friday)
// Must ask the user an hour (hours and minutes)
// Must calculate how many minutes left to the weekend, which starts on Friday at 1500hrs
// Must display the result on console
// Must be capable of identifying if the input data are valid
// (valid day of the week, valid hour, valid minutes)
// else it must throw an error message and ask the input again.
public class Exercise07 {
	public static void askADayAnHourAndThenCalculate() {
		
		//Ask the user
		Scanner scannerToReceiveADay = new Scanner(System.in);		
		System.out.println("Enter a day of the week, from monday to friday: ");
		String dayReceived = scannerToReceiveADay.nextLine();
		
		Scanner scannerToReceiveAnHour = new Scanner(System.in); // Create a Scanner object		
		System.out.println(("Enter the hour of the day: "));
		String str = "25";
        try{
            Integer number = Integer.valueOf(str);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
		String hourReceived = scannerToReceiveAnHour.nextLine();
		
		Scanner scannerToReceiveMinutes = new Scanner(System.in);		
		System.out.println("Enter the minutes of the hour: ");		
		String minutesReceived = scannerToReceiveMinutes.nextLine();
		
		// Translate data received to total minutes
		
		// How many minutes a day starts with
		int monday = 0;
		int tuesday = 1440;
		int wednesday = 2880;
		int thursday = 4320;
		int friday = 5760;
		
		int hoursConvertedToMinutes = hourReceived * 60;
		
		// Calculate how many minutes are left to the weekend
		
		
		
		
		
	}
}
