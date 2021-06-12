package com.thallescaltabiano.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thallescaltabiano.cursomc.domain.Categoria;
import com.thallescaltabiano.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource { //como se fosse a pasta de rotas do node/express
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) { //ResponseEntity é um tipo de dados do spring contendo diversas informações do http
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
