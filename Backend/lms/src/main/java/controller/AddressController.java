package controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.AddressDTO;
import dto.CountryDTO;
import dto.PlaceDTO;
import model.Address;
import model.Place;

@Controller
@RequestMapping(path = "/api/address")
public class AddressController extends BaseController<Address, AddressDTO> {

	@Override
	@GetMapping
	public ResponseEntity<Iterable<AddressDTO>> findAll() {
		ArrayList<AddressDTO> addresses = new ArrayList<AddressDTO>();

		for (Address a : service.findAll()) {
			CountryDTO country = new CountryDTO(null, a.getPlace().getCounty().getName(), new ArrayList<PlaceDTO>());
			PlaceDTO place = new PlaceDTO(null, a.getPlace().getName(), country);

			addresses.add(new AddressDTO(a.getStreet(), a.getHouseNumber(), place));

		}

		return new ResponseEntity<Iterable<AddressDTO>>(addresses, HttpStatus.OK);
	}

	@Override
	@GetMapping(path = "/{id}")
	public ResponseEntity<AddressDTO> findById(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		Address a = service.findById(id).orElse(null);

		if (a == null) {
			return new ResponseEntity<AddressDTO>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<AddressDTO>(
				new AddressDTO(null, a.getStreet(), a.getHouseNumber(),
						new PlaceDTO(null, a.getPlace().getName(),
								new CountryDTO(null, a.getPlace().getCounty().getName(), new ArrayList<PlaceDTO>()))),
				HttpStatus.CREATED);
	}

	@Override
	@PostMapping
	public ResponseEntity<AddressDTO> create(@RequestBody AddressDTO t) {
		Address a = service.create(new Address(t.getStreet(), t.getHouseNumber(), new Place(t.getPlace().getName())));
		return new ResponseEntity<AddressDTO>(
				new AddressDTO(null, a.getStreet(), a.getHouseNumber(),
						new PlaceDTO(null, a.getPlace().getName(),
								new CountryDTO(null, a.getPlace().getCounty().getName(), new ArrayList<PlaceDTO>()))),
				HttpStatus.CREATED);
	}

	@Override
	@PutMapping(path = "/{id}")
	public ResponseEntity<AddressDTO> update(@RequestBody AddressDTO t, @PathVariable("id") Long id) {
		Address a = service.findById(id).orElse(null);

		if (a == null) {
			return new ResponseEntity<AddressDTO>(HttpStatus.NOT_FOUND);
		}

		a.setStreet(t.getStreet());
		a.setHouseNumber(t.getHouseNumber());
		a.setPlace(new Place(t.getPlace().getName()));

		a = service.update(a);

		return new ResponseEntity<AddressDTO>(
				new AddressDTO(null,a.getStreet(), a.getHouseNumber(),
						new PlaceDTO(null,a.getPlace().getName(),
								new CountryDTO(null,a.getPlace().getCounty().getName(), new ArrayList<PlaceDTO>()))),
				HttpStatus.CREATED);
	}

}
