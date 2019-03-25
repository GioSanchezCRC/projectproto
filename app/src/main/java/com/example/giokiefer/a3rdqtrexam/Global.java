package com.example.giokiefer.a3rdqtrexam;

public class Global {
    double total, cost, average, parking, tolls, carpooling;
    Global(){}
    public void setTotal(double x){
        total = x;
    }
    public void setCost(double x){
        cost = x;
    }
    public void setAverage(double x){
        average = x;
    }
    public void setParking(double x){
        parking = x;
    }
    public void setTolls(double x){
        tolls = x;
    }
    public void setCarpooling(double x){
        carpooling = x;
    }
    public double getTotalCost(){
       double x = (((total/average)*cost + parking + tolls)-carpooling);
       return x;
    }
}
