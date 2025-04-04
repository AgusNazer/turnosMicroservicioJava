package com.agusdev.turnos.model; // no persiste en la base de datos porque ya persiste en su db de paciente (microservice)



import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {
    private Long idPaciente;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private String telefono;
}
