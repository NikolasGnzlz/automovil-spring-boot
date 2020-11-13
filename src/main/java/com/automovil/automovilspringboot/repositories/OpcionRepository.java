package com.automovil.automovilspringboot.repositories;

import com.automovil.automovilspringboot.entities.Opcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OpcionRepository extends JpaRepository<Opcion, Integer> {


}
