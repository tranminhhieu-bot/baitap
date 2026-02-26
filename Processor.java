package O_Room;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList list = new RoomList();
        int choice;

        do{
            System.out.println("\n1.Add MeetingRoom");
            System.out.println("2.Add BedRoom");
            System.out.println("3.Delete Room");
            System.out.println("4.Find Room");
            System.out.println("5.Display All");
            System.out.println("6.Count");
            System.out.println("0.Exit");
            System.out.print("Choose: ");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    MeetingRoom m = new MeetingRoom();
                    m.addRoom();
                    list.addRoom(m);
                    break;
                case 2:
                    BedRoom b = new BedRoom();
                    b.addRoom();
                    list.addRoom(b);
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    System.out.println(list.deleteById(sc.nextLine())?"Deleted":"Not Found");
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    Room r = list.findById(sc.nextLine());
                    if(r!=null) r.displayDetails();
                    else System.out.println("Not Found");
                    break;
                case 5:
                    list.displayAll();
                    break;
                case 6:
                    list.countRooms();
                    break;
            }
        }while(choice!=0);
    }
}