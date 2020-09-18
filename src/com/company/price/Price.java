package com.company.price;

import com.company.Movie;

/**
 * @ClassName price
 * @Description 价格
 * @Autor huanyao
 * @Date 2020/9/18 4:27 下午
 * @Version 1.0
 **/
public abstract class Price {
    /**
     * 获取定价类型
     * @return
     */
    public abstract int getPriceCode();

    /**
     * 计算租赁价格
     * @return
     */
    public abstract double getCharge(int daysRented);


    /**
     * 获取积分点
     * @return
     */
    public int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode()==Movie.NEW_RELEASE)&&(daysRented>1)) {
            return 2;
        }
        return 1;
    }
}
