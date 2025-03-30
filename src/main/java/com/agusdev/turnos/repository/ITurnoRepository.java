package com.agusdev.turnos.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agusdev.turnos.model.Turno;

public interface ITurnoRepository extends JpaRepository<Turno, Long>{

    public List<Turno> getTurnos();
    
    public void saveTUrno(Date fecha, String tratamiento, String dniPaciente);
    
    public void deleteTUrno(Long id);

    public Turno findTurno(Long id);

    public void editTurno(Long id, Turno turno);
}
