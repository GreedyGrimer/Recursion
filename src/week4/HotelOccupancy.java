package week4;

import javax.swing.*;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("How many floors are in the hotel:");
        int floor = Integer.parseInt(console.nextLine());
        int room, oRoom, tRoom, toRoom;
        tRoom = 0;
        toRoom = 0;

        for(int n=1; n <= floor; n++){
            System.out.printf("How many rooms are on floor %d:\n", n);
            room = Integer.parseInt(console.nextLine());
            tRoom = tRoom + room;
            System.out.println("How many of the rooms are occupied:");
            oRoom = Integer.parseInt(console.nextLine());
            toRoom = toRoom + oRoom;





        }
            int vRoom = tRoom - toRoom;
            double vRate = (double) vRoom/tRoom;
        System.out.printf("Floors: %d\n", floor);
        System.out.printf("Total Rooms: %d\n", tRoom);
        System.out.printf("Total Occupied Rooms: %d\n", toRoom);
        System.out.printf("Total Vacant Rooms: %d\n", vRoom);
        System.out.printf("Vacancy Rate: %.3f\n", vRate);




    }
}
