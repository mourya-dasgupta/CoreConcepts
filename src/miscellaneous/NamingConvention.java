package miscellaneous;

/**
 * Java follows CAMEL CASING except packages and constants
 * Class names should start with capital letter and normally is a noun.
 * method names should start with small letter and is normally an adjective.
 * Interface names should start with Capital letter and is normally end with 'ble' eg: Runnable, Serializable
 * variable names should start with a lower case and is normally short yet meaningful defining what does it contain or purpose it serves. Name can contain numbers, '_' and '$' but cannot start with these.
 *
 * EXCEPTIONS
 * Package names should be all in lower case letters even if there are multiple words in the name.
 * Constants should be all upper case letter and for multi-word, '_' acts as a discriminator.
 */
public class NamingConvention {     //Class
    public static void main(String[] args) {        //method
        int us_valueOf$ = 85;       //variable
        byte MAX_VALUE = 127;       //CONSTANT
    }
}
