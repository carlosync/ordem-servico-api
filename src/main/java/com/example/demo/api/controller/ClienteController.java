package com.example.demo.api.controller;


import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/api/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Carlos Aurélio");
		cliente1.setEmail("carlos@gmail.com");
		cliente1.setTelefone("9111-0000");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Karenis");
		cliente2.setEmail("karenis@gmail.com");
		cliente2.setTelefone("8111-9090");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
