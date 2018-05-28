package stpl;

public class StplMasterAcknowlegeState extends ServiceState{
    public void masterAck(Object dynamicObj){

        ServiceStateMachine serviceStateMachine=(ServiceStateMachine) dynamicObj;

        if(serviceStateMachine.getNoOfDocumentUpload()>4){
            serviceStateMachine.currentState=ServiceStateMachine.serviceStateMap.get("enquiry");
            System.out.println("ServiceState object changes from ---->masterAck state TO --> enquiry State");
        }


    };
}
