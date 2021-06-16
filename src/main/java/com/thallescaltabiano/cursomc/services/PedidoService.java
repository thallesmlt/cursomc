package com.thallescaltabiano.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thallescaltabiano.cursomc.domain.Pedido;
import com.thallescaltabiano.cursomc.repositories.PedidoRepository;
import com.thallescaltabiano.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired // instancia automaticamente um objeto PedidoRepository repo
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}