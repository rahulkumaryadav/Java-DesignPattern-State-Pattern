package stpl;

public class StplEnquiredState extends ServiceState{
    public void enquired(Object dynamicObj){
        ServiceStateMachine serviceStateMachine=(ServiceStateMachine)dynamicObj;

        /**
         * Validation part to check the condition for service will be written here.
         */

        if(serviceStateMachine.getNoOfDocumentUpload()>4){
            serviceStateMachine.currentState=ServiceStateMachine.serviceStateMap.get("quoted");
            //serviceStateMachine.currentState=new StplQuotedState();// we can assign by creating new object to currentObject.
            System.out.println("ServiceState object changes from ---->enquired state TO --> Quoted State");
        }
    };


}
