package com.mongo.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.app.entity.Orden;
import com.mongo.app.repository.OrdenRepository;

@Service
public class OrdenService {

	@Autowired private OrdenRepository ordenRepository;
	
	public List<Orden> getOrdenes(){		
		return ordenRepository.findAll();
	}
	
	public Orden saveOrden(Orden orden) {
		return ordenRepository.save(orden);
	}
	
	public List<Orden> getOrdenZona(String zona){
		return ordenRepository.findByZone(zona);
	}
	
	public Optional<Orden> getOrden(int id){
		return ordenRepository.findById(id);
	}
}
