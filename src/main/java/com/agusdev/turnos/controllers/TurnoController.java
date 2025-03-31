package com.agusdev.turnos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.agusdev.turnos.model.Turno;
import com.agusdev.turnos.service.ITurnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    private ITurnoService turnoService;

    @GetMapping("/getTurnos")
    public List<Turno> getTurnos() {
        return turnoService.getTurnos();
    }

    @GetMapping("/create")
    public Turno createTurno(){
        return Turno tu
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
