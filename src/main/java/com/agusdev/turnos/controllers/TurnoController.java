package com.agusdev.turnos.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.agusdev.turnos.model.Turno;
import com.agusdev.turnos.service.ITurnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    private ITurnoService turnoService;

    @GetMapping("/getTurnos")
    public List<Turno> traeTurnos() {
        return turnoService.getTurnos();
    }

    @PostMapping("/create")
    public String createTurno(  @RequestBody LocalDate fecha,
                                @RequestBody String tratamiento,
                                @RequestBody String dniPaciente){
        turnoService.saveTurno(fecha, tratamiento, dniPaciente);

        return "Turno creado correctamente";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteTurno(@PathVariable Long id){
        turnoService.deleteTurno(id);

        return "El turno fue eliminado correctamente";
    }

    @GetMapping("/edit/{id}")
        public Turno editTurno(@PathVariable Long id_original, @RequestBody Turno turnoEditar){
            Turno turnoEditado = turnoService.findTurno(id_original);

            return turnoEditado;
        }
    
    
}
