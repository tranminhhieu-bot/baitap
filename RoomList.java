package O_Room;

import java.util.ArrayList;

public class RoomList {
    private ArrayList<Room> list = new ArrayList<>();

    public void addRoom(Room r){
        list.add(r);
    }

    public Room findById(String id){
        for(Room r : list)
            if(r.getId().equalsIgnoreCase(id))
                return r;
        return null;
    }

    public boolean deleteById(String id){
        Room r = findById(id);
        if(r!=null){
            list.remove(r);
            return true;
        }
        return false;
    }

    public void displayAll(){
        for(Room r : list)
            r.displayDetails();
    }

    public void countRooms(){
        int meet=0, bed=0;
        for(Room r : list){
            if(r instanceof MeetingRoom) meet++;
            if(r instanceof BedRoom) bed++;
        }
        System.out.println("MeetingRooms: "+meet);
        System.out.println("BedRooms: "+bed);
    }
}