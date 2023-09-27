package com.senai.JuliaFariasDeQueiroz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_clientes")
public class Clientes {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idcClientes;
	
	@Column (name = "nome")
	private String nClientes;
	
	@Column (name = "fone")
	private String fone;
	
	public Long getId() {
		return idcClientes;
	}
	
	public void setId(Long id) {
		this.idcClientes = id;
	}
	
	public String getnClientes() {
		return nClientes;
	}
	
	public void setnClientes(String nClientes) {
		this.nClientes = nClientes;
	}
	
	public String getfone() {
		return fone;
	}
	
	public void setfone(String fone) {
		this.fone = fone;
	}
}
