package O_Room;

import java.util.Scanner;

public class BedRoom extends Room {
    private int numberOfBeds;

    public BedRoom() {}

    public BedRoom(String id, String name, double baseCost, int beds) {
        super(id, name, baseCost);
        this.numberOfBeds = beds;
    }

    public int getNumberOfBeds() { return numberOfBeds; }
    public void setNumberOfBeds(int numberOfBeds) { this.numberOfBeds = numberOfBeds; }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addRoom() {
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        System.out.print("Enter Name: ");
        setName(sc.nextLine());
        System.out.print("Enter Base Cost: ");
        setBaseCost(Double.parseDouble(sc.nextLine()));
        System.out.print("Enter Number of Beds: ");
        numberOfBeds = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void updateRoom() {
        System.out.print("New Name: ");
        setName(sc.nextLine());
        System.out.print("New Base Cost: ");
        setBaseCost(Double.parseDouble(sc.nextLine()));
        System.out.print("New Beds: ");
        numberOfBeds = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayDetails() {
        System.out.println("Bed Room | ID: " + getId()
                + " | Name: " + getName()
                + " | Cost: " + getBaseCost()
                + " | Beds: " + numberOfBeds);
    }
}
