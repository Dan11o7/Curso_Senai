package com.Danilo.senai.resorces;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Danilo.senai.domain.Cliente;
import com.Danilo.senai.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);

	}

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity <List<Cliente>> findAll() {
		List<Cliente> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public ResponseEntity<Object> insert(@Valid @RequestBody Cliente obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id}").buildAndExpand(obj.getIdCliente())
				.toUri();
		return ResponseEntity.created(uri).build();
	}	
	    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<Void> delete(@PathVariable Integer id){
	    	service.delete(id);
	    	return ResponseEntity.noContent().build();
	    }
		

	
}
