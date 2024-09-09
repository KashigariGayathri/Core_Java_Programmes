package doselectExProgrammes;

import java.util.List;
import java.util.ArrayList;

class Customer {
	public String name;
	public int numberOfRooms;

	public Customer(String name, int numberOfRooms) {
		this.name = name;
		this.numberOfRooms = numberOfRooms;
	}
}

class Hotel {
	public int totalRooms = 10;
	public int roomsBooked = 0;
	private List<String> guests = new ArrayList<>();

	public String checkIn(Customer customer) {
		if (roomsBooked + customer.numberOfRooms <= totalRooms) {

			for (int i = 0; i < customer.numberOfRooms; i++) {
				guests.add(customer.name);
				// System.out.println(guests);
			}
			roomsBooked += customer.numberOfRooms;
			// System.out.println(roomsBooked);
			return "Checked in";
		} else {
			return "No rooms available";
		}
	}

	public String checkRooms(Customer customer) {
		if (roomsBooked + customer.numberOfRooms <= totalRooms) {
			return "Rooms available";
		} else {
			return "No rooms available";
		}
	}

}

public class HotelException {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();

		Customer customer1 = new Customer("Alice", 2);
		System.out.println(hotel.checkIn(customer1));

	}
}
