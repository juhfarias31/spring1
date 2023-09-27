package com.senai.JuliaFariasDeQueiroz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.JuliaFariasDeQueiroz.entities.Clientes;
import com.senai.JuliaFariasDeQueiroz.services.ClientesService;


@RestController
@RequestMapping("/clientes")
public class ClientesController {
	private final ClientesService clientesService;
	
	@Autowired
	public ClientesController (ClientesService clientesService) {
		this.clientesService = clientesService;
	}

	@PostMapping
	public Clientes createClientes(@RequestBody Clientes clientes ) {
		return clientesService.saveCliente(clientes);
	}
	
	@GetMapping
	public List<Clientes> getAllClientes(){
		return clientesService.getAllClientes();
	}
	
	@GetMapping("/{id}")
	public Clientes getClientes(@PathVariable Long idcClientes) {
		return clientesService.getClientes(idcClientes);
	}
	
	@DeleteMapping
	public void deleteClientes(@PathVariable Long idcClientes) {
		clientesService.deleteClientes(idcClientes);
	}
}

