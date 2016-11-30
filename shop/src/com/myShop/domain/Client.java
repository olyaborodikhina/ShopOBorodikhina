package com.myShop.domain;

import com.myShop.exception.ClientNotExistsException;

/**
 * Created by hp on 27.11.2016.
 */
public class Client { private String name ="";
    private String surname ="";
    private String numberTelephone = "";
    private String address ="";


    public Client(String name,String surname,String numberTelephone,String address){
        this.name = name;
        this.surname = surname;
        this.numberTelephone = numberTelephone;
    }
    public Client(){}
    public void setName(String name) throws ClientNotExistsException {
        if(!"".equals(name))
        {
            this.name = name;
        }
        else
            throw new ClientNotExistsException("Not Found the Name Client");

    }

    public void setSurname(String surname) throws ClientNotExistsException {

        if(!"".equals(surname))
        {
            this.surname = surname;
        }
        else
            throw new ClientNotExistsException("Not Foundt the  Name");
    }

    public void setNumberTelephone(String numberTelephone) throws ClientNotExistsException {
        if(!"".equals(numberTelephone)) {
            this.numberTelephone = numberTelephone;
        }
        else
            throw new ClientNotExistsException("Not Found the Number Telephone");
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
