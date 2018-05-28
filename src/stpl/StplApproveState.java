package stpl;

public class StplApproveState extends ServiceState {
    public void approved(Object dynamicObj) {


        ServiceStateMachine serviceStateMachine = (ServiceStateMachine) dynamicObj;

        /**
         * valiodations
         */
        if (serviceStateMachine.getNoOfDocumentUpload() > 4) {
            serviceStateMachine.currentState = ServiceStateMachine.serviceStateMap.get("masterAck");
            //serviceStateMachine.currentState=new StplQuotedState();// we can assign by creating new object to currentObject.
            System.out.println("ServiceState object changes from ---->approved state TO --> masterAck State");
        }
    };
}
