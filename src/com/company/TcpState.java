package com.company;

public abstract class TcpState {
    public void activeOpen(){
        System.out.println("This is activeOpen");
    };
    public void passiveOpen(){
        System.out.println("This is passiveOpen");

    };
    public void transmit(){
        System.out.println("This is transmit");

    };
    public void close(){
        System.out.println("This is close");

    };
    public void connectionSynchronized(){
        System.out.println("This is connectionSynchronized");
    };
    public void acknowlege(){
        System.out.println("This is acknowlege");
    };
    public void send(){
        System.out.println("This is send");
    };
}
