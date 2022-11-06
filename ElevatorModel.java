import java.util.Scanner;

public class ElevatorModel {

    public String eleModel;
    public String Elevator ;


    public void type(){
        int choice ;
        ElevatorModel obj1 = new ElevatorModel();
        System.out.println("selct the down listed options");
        System.out.println("option-1 : Green Galaxy");
        System.out.println("option-2 : KCECPUc DX class");
        Scanner input1 = new Scanner(System.in);
        choice = input1.nextInt();

        if (choice == 1){
            obj1.Elevator = "Green Galaxy";
            System.out.println("you have selcted" + " " + obj1.Elevator);
        }
        else if (choice == 2){
                obj1.Elevator = "KCECPUc DX class";
                System.out.println("you have selcted" + " " + obj1.Elevator);
        }
        else {
            System.out.println("try again");
            type();
        }
        this.eleModel = obj1.Elevator;
    }
}
