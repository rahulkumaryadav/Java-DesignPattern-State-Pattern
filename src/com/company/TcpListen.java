package com.company;

public class TcpListen extends TcpState {
    public void transmit(){
        System.out.println("This is transmit");
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
