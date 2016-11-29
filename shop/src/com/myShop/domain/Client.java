package com.myShop.domain;

import com.myShop.exception.ClientExistsException;

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
    }

    public void setName(String name) throws ClientExistsException {
        if(!name.equals(""))
        {
            this.name = name;
        }
        else
        throw new ClientExistsException();

    }

    public void setSurname(String surname) throws ClientExistsException {

        if(!surname.equals(""))
        {
            this.surname = surname;
        }
        else
            throw new ClientExistsException();
    }

    public void setNumberTelephone(String numberTelephone) throws ClientExistsException {
        if(!numberTelephone.equals("")) {
            this.numberTelephone = numberTelephone;
        }
        else
            throw new ClientExistsException();
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getNumberTelephone(){
        return numberTelephone;
    }
}
