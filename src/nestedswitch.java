import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Empid = in.nextInt();
        String Department = in.next();
        switch (Empid) {
            case 1:
                System.out.println("arjun suryawanshi");
                break;
            case 2:
                System.out.println("moharsh prabhuji");
                break;
            case 3:
                System.out.println("mamaji ");
                break;
            default:
                System.out.println("enter correct idname");

        }
        switch (Department){
                                    case "IT":
                                        System.out.println("IT department");
                                        break;
                                    case "management":
                                        System.out.println("management department");
                                        break;
                                    default:
                                        System.out.println("enter the correct department");
                                    }

        }
    }

