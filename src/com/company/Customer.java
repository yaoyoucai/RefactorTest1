package com.company;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName Customer
 * @Description 顾客
 * @Autor huanyao
 * @Date 2020/9/18 2:25 下午
 * @Version 1.0
 **/
public class Customer {
    private String name;
    private Vector rentals=new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Enumeration rentalInfos = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalInfos.hasMoreElements()) {
            Rental each = (Rental) rentalInfos.nextElement();

            double thisAmount = each.getCharge();

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        }

        result+="Amount owed is "+String.valueOf(getTotalCharge())+"\n";
        result+="You earned"+ String.valueOf(getTotalFrequentRenterPoints())+"frequent renter point";
        return result;
    }

    public String htmlstatement() {
        Enumeration rentalInfos = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalInfos.hasMoreElements()) {
            Rental each = (Rental) rentalInfos.nextElement();

            double thisAmount = each.getCharge();

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        }

        result+="Amount owed is "+String.valueOf(getTotalCharge())+"\n";
        result+="You earned"+ String.valueOf(getTotalFrequentRenterPoints())+"frequent renter point";
        return result;
    }



    /**
     * 获取租赁总金额
     * @return
     */
    public double getTotalCharge() {
        double result=0;
        Enumeration rentals = this.rentals.elements();
        if (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result +=  rental.getCharge();
        }

        return result;
    }

    /**
     * 获取总积分数
     * @return
     */
    public int getTotalFrequentRenterPoints() {
        int result=0;
        Enumeration rentals = this.rentals.elements();
        if (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result += rental.getFrequentRenterPoints();
        }

        return result;
    }
}
