package com.automovil.automovilspringboot.repositories;


import com.automovil.automovilspringboot.entities.Automovil;;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutomovilRepository extends JpaRepository<Automovil, Integer> {


}