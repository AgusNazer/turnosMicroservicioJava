package com.agusdev.turnos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.agusdev.turnos.model.Turno;
import com.agusdev.turnos.service.ITurnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TurnoController {

    @Autowired
    private ITurnoService turnoService;

    @GetMapping("/getTurnos")
    public List<Turno> getTurnos() {
        return turnoService.getTurnos();
    }
    
}
