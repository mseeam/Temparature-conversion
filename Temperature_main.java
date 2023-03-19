/**
* The "Temperature_main.java" file has a class which contains main method. 
* The "Temperature.java" file has Temperature class which contains all necessary methods
* To compile and run the program, have "Temperature_main.java" && "Temperature.java" in same directory.
* Compile and run "Temperature_main.java"
* @author Mohammad Seeam
*/

//To take user input
import java.util.Scanner;

/* Temperature_main class contains constructor and main method */
public class Temperature_main extends Temperature{
    //Constructor
    public Temperature_main(){
        //To inherit and get access to Temperature class
        super(10);
    }

    /* below is main method */
    public static void main(String[] args){ 

        //To get user input
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the fahrenheit temperature: ");

        // ftemp_from_user holds the value of fahrenheit from user
        double ftemp_from_user=in.nextDouble();

        //New object 
        Temperature temperature=new Temperature(ftemp_from_user);

        //The celcius value after convertion
        double c_value=temperature.Celsius();
        System.out.println("The temperature in celsius is : "+ c_value);

        //The kelvin value after convertion
        double k_value=temperature.Kelvin();
        System.out.println("The temperature in kelvin is : "+ k_value);
        in.close(); 
    }

}



