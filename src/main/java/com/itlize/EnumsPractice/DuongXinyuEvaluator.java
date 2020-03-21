package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator{
    String myName;

    public DuongXinyuEvaluator(String input){
        myName = input;
    }

    public String getCatchPhrase(){
        return "Hey, my name is "+ myName+ "!";
    }

    public Boolean isDuong(){
        return myName.equals("Duong");
    }

    public Boolean isXinyu(){
        return myName.equals("xinyu");
    }
}