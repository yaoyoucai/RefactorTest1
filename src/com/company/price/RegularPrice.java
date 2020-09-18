package com.company.price;

import com.company.Movie;

/**
 * @ClassName ChildrensPrice
 * @Description TODO
 * @Autor huanyao
 * @Date 2020/9/18 4:28 下午
 * @Version 1.0
 **/
public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented>2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }


    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
