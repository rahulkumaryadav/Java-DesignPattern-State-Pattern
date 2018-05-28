package stpl;

public class StplQuotedState  extends ServiceState{
    public void quoted(Object dynamicObj){
        ServiceStateMachine serviceStateMachine= (ServiceStateMachine) dynamicObj;

        if(serviceStateMachine.getNoOfDocumentUpload()>4){
            serviceStateMachine.currentState=ServiceStateMachine.serviceStateMap.get("approved");
            System.out.println("ServiceState object changes from ---->quoted state TO --> approved State");

        }


    };
}
