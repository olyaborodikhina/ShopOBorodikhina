package com.myShop.domain;

import com.myShop.exception.ClientNotExistsException;

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

    public void setName(String name) throws ClientNotExistsException {
        if(!name.equals(""))
        {
            this.name = name;
        }
        else
        throw new ClientNotExistsException();

    }

    public void setSurname(String surname) throws ClientNotExistsException {

        if(!surname.equals(""))
        {
            this.surname = surname;
        }
        else
            throw new ClientNotExistsException();
    }

    public void setNumberTelephone(String numberTelephone) throws ClientNotExistsException {
        if(!numberTelephone.equals("")) {
            this.numberTelephone = numberTelephone;
        }
        else
            throw new ClientNotExistsException();
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
