package com.thallescaltabiano.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thallescaltabiano.cursomc.domain.Pedido;
import com.thallescaltabiano.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource{ //como se fosse a pasta de rotas do node/express
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) { //ResponseEntity é um tipo de dados do spring contendo diversas informações do http
		Pedido obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
