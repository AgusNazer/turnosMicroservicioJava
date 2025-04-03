package com.agusdev.turnos.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.agusdev.turnos.model.Turno;

public interface ITurnoRepository extends JpaRepository<Turno, Long>{

}
