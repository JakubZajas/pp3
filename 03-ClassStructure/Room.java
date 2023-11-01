public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number){
        this.number=number;
        this.beds=2;
    }
    Room(int number,int beds){
        this.number=number;
        this.beds=beds;
    }

    public void checking(String guestName){
        this.guestName=guestName;
        this.occupied=true;
    }
    public void checkout(){
        this.guestName = null;
        this.occupied=false;
    }
    public boolean isOccupied(){
        System.out.println(this.occupied);
        return occupied;
    }
    public void displayStatus(){
        System.out.println(toString());
    }

    public String toString(){
        String out = String.format("Room number:%02d, Beds: %02d, is occcupied:%b, Guest name:%s",number,beds,occupied,guestName== null ? "N/A" : guestName);
        return out;
    }


    public static void singleRoomStatus(Room room){
        System.out.printf("Room %d: Beds: %d, Occupied: %s, Guest Name: %s%n",
        room.number, room.beds, room.occupied ? "Yes" : "No", room.guestName == null ? "N/A" : room.guestName);
    }
    public static void roomReport(Room[] rooms){
        for(Room i:rooms){
            System.out.println(i);
        }
    }
    public static void roomsWithBeds(Room[] rooms, int beds){
        System.out.println("Rooms with " + beds + " beds:");
        for(Room i:rooms){
            if(i.beds == beds){
                singleRoomStatus(i);
            }
        }
    }
    public static void vacantRooms(Room[] rooms){
        int vacant=0;
        int notVacant=0;

        for(Room i:rooms){
            if(i.occupied){
                notVacant++;
            }else{
                vacant++;
            }
        }
        System.out.println("Vacant rooms: "+vacant);
        System.out.println("Occupied rooms: "+notVacant);

    }
    public static void bedsAvailable(Room[] rooms){
        int bedsAvailable=0;
        for(Room i:rooms){
            if(!i.occupied){
                bedsAvailable+=i.beds;
            }
        }
        System.out.println("Beds available: "+bedsAvailable);

    }


    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(6,1);  
        
        rooms[0].checking("Allice");
        rooms[3].checking("Jonh");
        rooms[5].checking("Bob");

        
        //singleRoomStatus(rooms[0]);
        //roomReport(rooms);
        // roomsWithBeds(rooms, 2);
        // vacantRooms(rooms);
        // bedsAvailable(rooms);

        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }
}
