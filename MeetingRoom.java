package O_Room;

import java.util.Scanner;

public class MeetingRoom extends Room {
    private int capacity;

    public MeetingRoom() {}

    public MeetingRoom(String id, String name, double baseCost, int capacity) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addRoom() {
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        System.out.print("Enter Name: ");
        setName(sc.nextLine());
        System.out.print("Enter Base Cost: ");
        setBaseCost(Double.parseDouble(sc.nextLine()));
        System.out.print("Enter Capacity: ");
        capacity = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void updateRoom() {
        System.out.print("New Name: ");
        setName(sc.nextLine());
        System.out.print("New Base Cost: ");
        setBaseCost(Double.parseDouble(sc.nextLine()));
        System.out.print("New Capacity: ");
        capacity = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayDetails() {
        System.out.println("Meeting Room | ID: " + getId()
                + " | Name: " + getName()
                + " | Cost: " + getBaseCost()
                + " | Capacity: " + capacity);
    }
}
