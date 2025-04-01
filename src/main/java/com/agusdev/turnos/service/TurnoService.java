package com.agusdev.turnos.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.agusdev.turnos.model.Paciente;
import com.agusdev.turnos.model.Turno;
import com.agusdev.turnos.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnoService {

    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired RestTemplate apiConsumir;

    @Override
    public List<Turno> getTurnos() {
        return turnoRepository.findAll();
    }

    // Crear usuario, consumir del servicio pacientes
    @Override
    public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente) {

        // buscar el paciente en la api pacientes
        Paciente pac = apiConsumir.getForObject("http://localhost:9001/pacientes/dniPaciente", Paciente.class);
        String nombreCompletoPaciente = pac.getNombre()+" "+pac.getApellido();

        Turno turno = new Turno();
        turno.setFecha(fecha);
        turno.setTratamiento(tratamiento);
        turno.setNombreCompletoPaciente(nombreCompletoPaciente);
    
        turnoRepository.save(turno);
    }

    @Override
    public void editTurno(Long id, Turno turno) {
        Turno turn = this.findTurno(id);

        turn.setFecha(turn.getFecha());
        turn.setTratamiento(turn.getTratamiento());
        turn.setNombreCompletoPaciente(turn.getNombreCompletoPaciente());

        turnoRepository.save(turn);
    }

    @Override
    public Turno findTurno(Long id) {
        return turnoRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTurno(Long id) {
        turnoRepository.deleteById(id);
    }

    

    
}
