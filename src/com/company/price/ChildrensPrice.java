package com.company.price;

import com.company.Movie;

/**
 * @ClassName ChildrensPrice
 * @Description TODO
 * @Autor huanyao
 * @Date 2020/9/18 4:28 下午
 * @Version 1.0
 **/
public class ChildrensPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented>3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
