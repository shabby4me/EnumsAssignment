package com.itlize.EnumsPractice;

public enum DuongXinyuEnum{
    Duong("Duong"), Xinyu("Xinyu");

    private DuongXinyuEnum(String n){
        name = n;
    }

    public String name = "No Name";
    
    public String getCatchPhrase(){
        return "Hey, my name is "+ name+ "!";
    }

    public Boolean isDuong(){
        return this.name().equals("Duong");
    }

    public Boolean isXinyu(){
        return this.name().equals("Xinyu");
    }
}