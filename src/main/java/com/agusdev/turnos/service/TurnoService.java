package com.agusdev.turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agusdev.turnos.model.Turno;
import com.agusdev.turnos.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnoService {

    @Autowired
    private ITurnoRepository turnoRepository;

    @Override
    public List<Turno> getTurnos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTurnos'");
    }

    @Override
    public void saveTurno(Turno turno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationExceptions("Unimplemented method 'saveTurno'");
    }

    @Override
    public void editTurno(Long id, Turno turno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editTurno'");
    }

    @Override
    public Turno findTurno(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findTurno'");
    }

    @Override
    public Turno deleteTurno(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTurno'");
    }

    

    
}
