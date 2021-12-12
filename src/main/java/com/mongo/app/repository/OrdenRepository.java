package com.mongo.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongo.app.entity.Orden;

@Repository
public interface OrdenRepository extends MongoRepository<Orden, Integer>{

	@Query("{'salesMan.zone': ?0}")
	List<Orden> findByZone(final String zona);
//	
//	@Query("{status: ?0}")
//	List<Orden> findByStatus(final String status);
//	
//	Optional<Orden> findTopByOrdenByIdDesc();
	
}






















