package com.agusdev.turnos.service;

import java.time.LocalDate;
import java.util.List;

import com.agusdev.turnos.model.Turno;

public interface ITurnoService {

    public List<Turno> getTurnos();

    void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente);

    public void editTurno(Long id, Turno turno);

    public Turno findTurno(Long id);

    public void deleteTurno(Long id);
}
