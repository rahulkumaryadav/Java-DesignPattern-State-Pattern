package stpl;

import java.util.HashMap;
import java.util.Map;

public class ServiceStateMachine {

    public static Map<String,ServiceState> serviceStateMap =new HashMap<>();

    static{
        serviceStateMap.put("enquiry",new StplEnquiredState());
        serviceStateMap.put("quoted",new StplQuotedState());
        serviceStateMap.put("approved",new StplApproveState());
        serviceStateMap.put("masterAck",new StplMasterAcknowlegeState());

    }
    ServiceState currentState;
    private int noOfDocumentUpload=9;

    ServiceStateMachine(){
        currentState=ServiceStateMachine.serviceStateMap.get("enquiry");
        System.out.println("currentState object  by default set in ------->  enquired state");
    }



    public void enquired(){
        currentState.enquired(this);

    };
    public void quoted(){
        currentState.quoted(this);

    };
    public void approved(){
        currentState.approved(this);

    };
    public void masterAck(){
        currentState.masterAck(this);

    };

    public int getNoOfDocumentUpload() {
        return noOfDocumentUpload;
    }

    public void setNoOfDocumentUpload(int noOfDocumentUpload) {
        this.noOfDocumentUpload = noOfDocumentUpload;
    }

}
