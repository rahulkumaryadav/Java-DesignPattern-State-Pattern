package stpl;

public abstract class ServiceState {
    public void enquired(Object object){
        System.out.println("---------------------------------------------------------------");
       // System.out.println("DEFAULT IMPLIMENTATION OF ENQUIRY");
        System.out.println("---------------------------------------------------------------");

    };
    public void quoted(Object object){
        System.out.println("---------------------------------------------------------------");
        //System.out.println("DEFAULT IMPLIMENTATION OF QUOTED");
        System.out.println("---------------------------------------------------------------");

    };
    public void approved(Object object){
        System.out.println("---------------------------------------------------------------");
        //System.out.println("DEFAULT IMPLIMENTATION OF APPROVED");
        System.out.println("---------------------------------------------------------------");

    };
    public void masterAck(Object object){
        System.out.println("---------------------------------------------------------------");
        //System.out.println("DEFAULT IMPLIMENTATION OF MASTERACKNOWLEDGE");
        System.out.println("---------------------------------------------------------------");

    };
}
