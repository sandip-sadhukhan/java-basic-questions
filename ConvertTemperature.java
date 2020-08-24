public class ConvertTemperature {
    public static void main(String[] args) {
        float celsius = 37.0F;
        // c/5 = (f-32)/9
        // f = (c/5*9) + 32
        float farenheit = (celsius/5*9) + 32;
        System.out.println("Celsius = "+celsius+"\nFareheit = "+farenheit);
    }
}