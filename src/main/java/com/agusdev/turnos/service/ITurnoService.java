package com.agusdev.turnos.service;

import java.util.List;

import com.agusdev.turnos.model.Turno;

public interface ITurnoService {

    public List<Turno> getTurnos();

    public void saveTurno(Turno turno);

    public void editTurno(Long id, Turno turno);

    public Turno findTurno(Long id);

    public Turno deleteTurno(Long id);
}
