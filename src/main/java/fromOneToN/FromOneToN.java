package fromOneToN;

import java.math.BigDecimal;

public class FromOneToN {
    public static void main(String[] args) {
        FromOneToN nu = new FromOneToN();

    }
    public BigDecimal multiple(int end){
        if (end <= 10){
            System.out.println("parameter end must be > 10 number:");
            return BigDecimal.ZERO;
        }
        BigDecimal mult = BigDecimal.ONE;
        if (end >99){
            for (int i =10; i <= 99; i++){
                if (i % 2 ==0){
                    mult =mult.multiply(BigDecimal.valueOf(i));
                }
            }
            return  mult;
        }
        for (int i = 10 ; i <= end ; i++){
            if (i % 2 == 0){
                mult = mult.multiply(BigDecimal.valueOf(i));
            }
        }return mult;
    }
}
