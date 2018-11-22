package com.hassanmoazeni.hello;

public class User {

    private String user_name;
    private String last_name;
    private String phone_number;

    public User(){
    }

    public User (String phone_number) {
        setPhone_number(phone_number);
    }

    public User (String user_name,String last_name,String phone_number){
        setUser_name(user_name);
        setLast_name(last_name);
        setPhone_number(phone_number);
    }



    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
