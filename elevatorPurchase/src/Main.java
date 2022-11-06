public class Main {
    public static void main(String[]args){
        ElevatorModel purchaseModel = new ElevatorModel();
        purchaseModel.type();
//        String elevatorType = purchaseType.eleType;
        ElevatorVersion purchaseVersion = new ElevatorVersion();
        purchaseVersion.version();
        System.out.println("Thanks for purchase" + " " + purchaseModel.eleModel+ " " + "with" +
                " " + purchaseVersion.ver + " " + "features .");
    }
}
