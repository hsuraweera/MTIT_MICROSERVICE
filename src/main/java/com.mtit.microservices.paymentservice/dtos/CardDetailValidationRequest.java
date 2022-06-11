package com.mtit.microservices.paymentservice.dtos;

public class CardDetailValidationRequest {

    private String cardNumber;
    private String month;
    private String year;
    private String cvv;

    public String getcardNumber() {
        return cardNumber;
    }

    public void setcardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getmonth() {
        return month;
    }

    public void setmonth(String month) {
        this.month = month;
    }

    public String getyear() {
        return year;
    }

    public void setyear(String year) {
        this.year = year;
    }

    public String getcvv() {
        return cvv;
    }

    public void setcvv(String cvv) {
        this.cvv = cvv;
    }


    @Override
    public String toString() {
        return "CardDetailValidationRequest{" +
                "cardNumber='" + cardNumber + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", cvv=" + cvv +
                '}';
    }
}