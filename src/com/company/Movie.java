package com.company;

import com.company.price.ChildrensPrice;
import com.company.price.NewReleasePrice;
import com.company.price.Price;
import com.company.price.RegularPrice;

/**
 * @ClassName mytest.Movie
 * @Description 影片
 * @Autor huanyao
 * @Date 2020/9/18 2:21 下午
 * @Version 1.0
 **/
public class Movie {
    public static final int CHILDRENS=2;//儿童版本
    public static final int REGULAR=0;//定期版本
    public static final int NEW_RELEASE=1;//最新发布

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode)  {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;

        }
    }

    /**
     * 计算租赁价格
     * @return
     */
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    /**
     * 获取积分点
     * @return
     */
    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
