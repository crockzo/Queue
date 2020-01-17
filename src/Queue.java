import java.util.Scanner;

public class Queue {
    private static Scanner scan = new Scanner(System.in);
    private static final int MAX = 3;
    private static int[] queue = new int[MAX];
    private static int FRONT = -1 , REAR = -1;
    static {
        System.out.println("QUEUE IMPLEMENTATION");
    }
    public static void main(String[] args) {
        int choice;
        boolean flag = true;
        while (flag) {
            System.out.println("\n1 : INSERT ");
            System.out.println("2 : READ");
            System.out.println("3 : DELETE");
            System.out.println("4 : EXIT");
            System.out.print("\nENTER OPTION : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    insertElement();
                    break;
                case 2:
                    readQueue();
                    break;
                case 3:
                    deleteElement();
                    break;
                case 4:
                    System.out.println("** END OF QUEUE **");
                    flag = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
    private static void insertElement(){
        if(REAR==(MAX-1)){
            System.out.println("OVER FLOW");
        }else{
            if(REAR == -1){
                ++REAR;
                ++FRONT;
                System.out.print("\nENTER THE ELEMENT : ");
                queue[REAR] = scan.nextInt();
            }else{
                ++REAR;
                System.out.print("\nENTER THE ELEMENT : ");
                queue[REAR] = scan.nextInt();
            }

        }
    }

    private static void readQueue(){
        System.out.println("\n*** QUEUE ***");
        for(int i  = FRONT ; i<=REAR ; i++){
            System.out.print(queue[i] + " \t");
        }
        System.out.println("\n");
    }

    private static void deleteElement(){
        if(FRONT==-1){
            System.out.println("UNDER FLOW");
        }else if(REAR==FRONT){
            System.out.println("\n" + queue[FRONT] + " IS DELETED FROM THE QUEUE");
            REAR = -1;
            FRONT = -1;
        }else{
            System.out.println("\n" + queue[FRONT] + " IS DELETED FROM THE QUEUE");
            ++FRONT;
        }
    }
}
