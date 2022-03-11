package com.example.tutcustomlistview;

public class Contact {
    private  String name;
    private  String nCC;
    private int chat;

    public Contact(String name, String nCC, int chat){
        super();
        this.chat= chat;
        this.name = name;
        this.nCC = nCC;
    }

    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name= name;
    }

    public String getnCC(){
        return nCC;
    }
    public  void setnCC(String nCC){
        this.nCC=nCC;
    }
    public int getchat(){
        return chat;
    }
    public  void setchat(int chat){
        this.chat=chat;
    }
}
