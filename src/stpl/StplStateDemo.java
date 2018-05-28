package stpl;

public class StplStateDemo {
    public static void main(String[] args) {

        String userInputState="enquiry";

        ServiceStateMachine serviceState=new ServiceStateMachine();

        serviceState.enquired();
        serviceState.enquired();
        serviceState.quoted();
        serviceState.quoted();
        serviceState.enquired();
        serviceState.enquired();
        serviceState.approved();
        serviceState.approved();
        serviceState.approved();
/*
        if(userInputState.equalsIgnoreCase("enquiry")){
            serviceState.enquired();

        }else if (userInputState.equalsIgnoreCase("quoted")){
            serviceState.quoted();
        }else if (userInputState.equalsIgnoreCase("approved")){
            serviceState.approved();
        }else {
            serviceState.masterAck();
        }*/
    }
}
