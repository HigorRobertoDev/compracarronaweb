package br.com.compracarronaweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.compracarronaweb.model.Carro;

@RestController
@RequestMapping(value = "/anuncio")
public class CarrosAnunciosController {
	
	@GetMapping
	public List<Carro> getAll() {
		
		Carro carro1 = new Carro("Pajero", "Sport", 2005, 4, "Preto");
		Carro carro2 = new Carro("Civic", "TOP", 2019, 4, "Preto");
		
		List<Carro> carros = new ArrayList<>();
		carros.add(carro1);
		carros.add(carro2);
		
		return carros;
	}
	
}
