package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import service.ServiceInterface;

public abstract class BaseController<T, DTO> implements ControllerInterface<DTO> {
	@Autowired
	protected ServiceInterface<T> service;

	public BaseController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseController(ServiceInterface<T> service) {
		super();
		this.service = service;
	}

	public ServiceInterface<T> getService() {
		return service;
	}

	public void setService(ServiceInterface<T> service) {
		this.service = service;
	}

	@Override
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<DTO> delete(@PathVariable("id") Long id) {
		if (service.findById(id).orElse(null) == null) {
			return new ResponseEntity<DTO>(HttpStatus.NOT_FOUND);
		}
		this.service.delete(id);
		return new ResponseEntity<DTO>(HttpStatus.OK);
	}

	@Override
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<DTO> softDelete(@PathVariable("id") Long id) {
		if (service.findById(id).orElse(null) == null) {
			return new ResponseEntity<DTO>(HttpStatus.NOT_FOUND);
		}
		this.service.softDelete(id);
		return new ResponseEntity<DTO>(HttpStatus.OK);
	}
}
