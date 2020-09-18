package com.company;

/**
 * @ClassName Rental
 * @Description 租赁
 * @Autor huanyao
 * @Date 2020/9/18 2:24 下午
 * @Version 1.0
 **/
public class Rental {
    //影片
    private Movie movie;
    //租赁天数
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    /**
     * 获取积分点
     * @return
     */
    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }
}
