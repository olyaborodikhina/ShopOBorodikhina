package com.myShop.domain;

/**
 * Created by hp on 27.11.2016.
 */
public class Client {
    private String name ="";
    private String surname ="";
    private String numberTelephone = "";
    private String address ="";
    //private Order order = new Order(); // ??

    public Client(){} //?

    public Client(String name,String surname,String numberTelephone,String address){
        this.name = name;
        this.surname = surname;
        this.numberTelephone = numberTelephone;
        //this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setNumberTelephone(String numberTelephone){
        this.numberTelephone = numberTelephone;
    }
}
