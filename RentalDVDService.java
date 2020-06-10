/**
 * 렌털DVD가계에서 나이와 작품 대여시작일을 참고로 할인요금계산 소프트웨어이다.
 * 
 * @author (2017605038스피겔 크릴 2018243144노무라 타카미치 2018315054 호즈미요시아키)
 * @version (2020/06/10)
 */
public class RentalDVDService
{
    /*
     * 18세이하는 10%할인이고 65세이상은 20%할인하고 구작은 반액으로 하는 메소드 
     * 2가지 이상의 할인적용조건이 중복되는 경우는 할인율이 높은 조건을 우선함.
     */
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