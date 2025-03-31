package com.agusdev.turnos.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.agusdev.turnos.model.Turno;

public interface ITurnoRepository extends JpaRepository<Turno, Long>{

    // public  List<Turno> getTurnos();
    
    // public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente);
    
    // public void deleteTurno(Long id);

    // public Turno findTurno(Long id);

    // public void editTurno(Long id, Turno turno);
}
