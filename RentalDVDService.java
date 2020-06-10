
/**
 * Write a description of class RentalDVDService here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RentalDVDService
{
    public double discountCalculation(int age, boolean oldMovie){
        double dvdPrice = 1000;    
        if (oldMovie){
            dvdPrice = 1000 / 2;
                }
        else if( age >= 65){
            dvdPrice = 1000 * 0.8;
        }
        else if( age <= 18){
            dvdPrice = 1000 * 0.9;
        }
        return dvdPrice;
    }
}
