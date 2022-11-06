import java.util.Scanner;

public class ElevatorVersion {
    public String eleVersion ;
    public String ver;

    public void version(){
        int option;
        ElevatorVersion obj2 = new ElevatorVersion();
        System.out.println("selct the down listed options");
        System.out.println("low cost");
        System.out.println("premium");
        Scanner input2 = new Scanner(System.in);
        option = input2.nextInt();

        if (option == 1){
            obj2.eleVersion = "low-cost";
        } else if (option == 2) {
            obj2.eleVersion = "premium";
        }
        else {
            System.out.println("try again");
            version();
        }
        this.ver = obj2.eleVersion;
    }
}
