package com.apirest.springreactmongodb.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.apirest.springreactmongodb.model.Pokemon;

public interface PokedexRepository extends ReactiveMongoRepository<Pokemon, String>{

}
