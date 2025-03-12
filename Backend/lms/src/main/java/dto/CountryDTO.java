package dto;

import java.util.List;

public class CountryDTO {
	private Long id;
	private String name;
	private List<PlaceDTO> places;

	public CountryDTO() {
	}

	public CountryDTO(Long id, String name, List<PlaceDTO> places) {
		this.id = id;
		this.name = name;
		this.places = places;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PlaceDTO> getPlaces() {
		return places;
	}

	public void setPlaces(List<PlaceDTO> places) {
		this.places = places;
	}
}
