package com.thallescaltabiano.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thallescaltabiano.cursomc.domain.Cliente;
import com.thallescaltabiano.cursomc.repositories.ClienteRepository;
import com.thallescaltabiano.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired // instancia automaticamente um objeto ClienteRepository repo
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
