package controller;

import org.springframework.http.ResponseEntity;

import dto.RegisteredUserDTO;
import model.RegisteredUser;

public class RegisteredUserController extends BaseController<RegisteredUser, RegisteredUserDTO>{

	@Override
	public ResponseEntity<Iterable<RegisteredUserDTO>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<RegisteredUserDTO> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<RegisteredUserDTO> create(RegisteredUserDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<RegisteredUserDTO> update(RegisteredUserDTO t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
