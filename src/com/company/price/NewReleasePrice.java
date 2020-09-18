package com.company.price;

import com.company.Movie;

/**
 * @ClassName ChildrensPrice
 * @Description TODO
 * @Autor huanyao
 * @Date 2020/9/18 4:28 下午
 * @Version 1.0
 **/
public class NewReleasePrice extends Price {
    @Override
    public  int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result =daysRented  * 3;
        if (daysRented>3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }


    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented>1?2:1;
    }
}
