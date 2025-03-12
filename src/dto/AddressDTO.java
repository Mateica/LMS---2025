package dto;

public class AddressDTO {
	private String username; // Zamena za ID
	private String street;
	private int houseNumber;
	private PlaceDTO place; // Zamena za direktni model referencu

	public AddressDTO() {
	}

	public AddressDTO(String username, String street, int houseNumber, PlaceDTO place) {
		this.username = username;
		this.street = street;
		this.houseNumber = houseNumber;
		this.place = place;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public PlaceDTO getPlace() {
		return place;
	}

	public void setPlace(PlaceDTO place) {
		this.place = place;
	}
}
