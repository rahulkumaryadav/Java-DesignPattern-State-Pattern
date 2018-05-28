package com.company;

/**
 * State Mechine
 * it will also work as proxy for diffrent state.
 *
**/
public class TcpConnection extends TcpState{
    TcpState currentState;

    public TcpConnection(){
        System.out.println("By default currentState is assigned as  CLOSE OBJECT");
        currentState=new TcpClosed();
    }

    public void activeOpen(){
        System.out.println("By default close state is activeOpen");
        currentState.activeOpen();
    };
    public void passiveOpen(){
        currentState.passiveOpen();
    };
    public void transmit(){
        currentState.transmit();
    };
    public void close(){
        currentState.close();
    };
    public void connectionSynchronized(){
         currentState.connectionSynchronized();
    };
    public void acknowlege(){
        currentState.acknowlege();
    };
    public void send(){
        currentState.send();
    };
}
