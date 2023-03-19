/**
* The "Temperature_main.java" file has a class which contains main method. 
* The "Temperature.java" file has Temperature class which contains all necessary methods
* To compile and run the program, have "Temperature_main.java" && "Temperature.java" in same directory.
* Compile and run "Temperature_main.java"
* @author Mohammad Seeam
*/

/* Temperature class contains all necessary method */
public class Temperature{

    //To store fahrenheit value
    private double fahrenheit;
    //To store ftemp value
    private double ftemp;
    
    /* Constructor */
    public Temperature(double fahrenheit){
        this.ftemp=fahrenheit;
    }

    /* setFahrenheit sets ftemp value to fahrenheit */
    public void setFahrenheit(double fahrenheit){
        this.ftemp=fahrenheit;
    }

    /* getFahrenheit returns ftemp value  */
    public double getFahrenheit(){
        return ftemp;
    }

    /* Celsius method convert to celcius  */
    public double Celsius(){
        // celsius_value to store celsius value after convertion
        double celsius_value = (((ftemp-32)*5)/9);
        return celsius_value;
    }

    /* Kelvin method convert to kelvin  */
    public double Kelvin(){
        // kelvin_value to store kelvin value after convertion
        double kelvin_value = ((((ftemp-32)*5)/9)+273);
        return kelvin_value;
    }

}


