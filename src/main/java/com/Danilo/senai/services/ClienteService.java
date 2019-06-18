package com.Danilo.senai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Danilo.senai.domain.Cliente;
import com.Danilo.senai.repositories.ClienteRepository;
import com.Danilo.senai.repositories.EnderecoRepository;
import com.Danilo.senai.service.exception.ObjectNotFoundException;





@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	@Autowired
	private EnderecoRepository enderecoRepository;

	public Cliente buscar(Integer idCliente) {
        Optional<Cliente> obj = repo.findById(idCliente);
        return obj.orElseThrow(()-> new  ObjectNotFoundException(
       "numero de  id não encontrado. Id: " + idCliente + ",tipo: " + Cliente.class.getName()));
	}
	public List<Cliente> findAll() {
		return repo.findAll();
	}
		
		public Cliente insert(Cliente obj) {
			obj.setIdCliente(null);
			enderecoRepository.saveAll(obj.getEnderecos());
			return obj;
			
	}
		public void delete (Integer id) {
			buscar(id);
			repo.deleteById(id);
		}
}