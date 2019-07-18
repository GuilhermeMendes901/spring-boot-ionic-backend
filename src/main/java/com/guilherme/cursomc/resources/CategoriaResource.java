package com.guilherme.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.cursomc.domain.Categoria;
import com.guilherme.cursomc.services.CategoriaService;

//O Controlador Rest (@RestController) responde pelo EndPoint: "/categorias".

//No Request, no padrão "RequestMethod" é importante atribuir os verbos Http adequados para cada operação que eu quero, como exemplo:
//GET = Para obter dados;
//POST = Criar um novo dado, salvar um novo recurso;
//DETELE = Deleta.

@RestController //Associada com classes que possuem métodos que processam requests numa aplicação web.
@RequestMapping(value="/categorias") //Geralmente utilizada em cima dos métodos de uma classe anotada com @Controller. Serve para você colocar os endereços da sua aplicação que, quando acessados por algum cliente, deverão ser direcionados para o determinado método.
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
