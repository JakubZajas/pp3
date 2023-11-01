public class TempConverter {
    public static double CelsiusToKelvin(double tempInCelsius){
        return tempInCelsius+273.15;
    }
     public static double CelsiusToFahrenheit(double tempInCelsius){
        
        return (tempInCelsius*9/5)+32;
    }
    public static double KelvinToCelsius(double tempInKelvin){
        
        return tempInKelvin-273.15;
    }
    public static double KelvinToFahrenheit(double tempInKelvin){
        double tempInCelsius=tempInKelvin-273.15;
        return (tempInCelsius*9/5)+32;
    }
    public static double FahrenheitToCelsius(double tempInFahrenheit){
        
        return (tempInFahrenheit-32)*5/9;
    }
    public static double FahrenheitToKelvin(double tempInFahrenheit){
        double tempInCelsius=(tempInFahrenheit-32)*5/9;
        return tempInCelsius+273.15;
    }
    public static void main(String[] args){
        System.out.println(CelsiusToKelvin(25));
        System.out.println(CelsiusToFahrenheit(25));
        System.out.println(KelvinToCelsius(0));
        System.out.println(KelvinToFahrenheit(0));
        System.out.println(FahrenheitToCelsius(100));
        System.out.println(FahrenheitToKelvin(100));        
    }
}
