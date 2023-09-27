package com.senai.JuliaFariasDeQueiroz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.JuliaFariasDeQueiroz.entities.Clientes;
import com.senai.JuliaFariasDeQueiroz.repositories.ClientesRepository;

@Service
public class ClientesService {
	private final ClientesRepository clienteRepository;
	
	public ClientesService (ClientesRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Clientes saveCliente (Clientes cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Clientes getClientes (Long idcClientes) {
		return clienteRepository.findById(idcClientes).orElse(null);
	}

	public List<Clientes> getAllClientes(){
		return clienteRepository.findAll();
	}
	
	public void deleteClientes (Long idcClientes) {
		clienteRepository.deleteById(idcClientes);
	}
	
}
