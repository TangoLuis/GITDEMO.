package com.example.demo.domain;

import com.example.demo.domain.Empleado;
import lombok.Data;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@Data
@Component

public class Empresa {

    private String nombre;
    private String direccion;
    private String telefono;
    private int nit;
    private ArrayList<Empleado> empleados;

    /*public String inscribirEmpleado(Empleado trabajador,String nombreEmpresa){
        String inscrito = "El trabajador "+ trabajador.getNombreEmpleado() + " Correo: "+ trabajador.getCorreoEmpleado() + "Rol: "+ trabajador.getRolEmpleado() + " Trabaja en la empresa: "+ nombreEmpresa;
        return inscrito;
    }*/
}
