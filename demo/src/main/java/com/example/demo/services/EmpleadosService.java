package com.example.demo.services;

import com.example.demo.domain.Empleado;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service


public class EmpleadosService {




    ArrayList <Empleado> listaEm;
    public EmpleadosService(ArrayList<Empleado> listaEm) {
        this.listaEm = listaEm;
    }
    public ArrayList<Empleado> listar (){

        System.out.println("Metodo listar del service");

        return listaEm;

    }
    public boolean addEmpleado (Empleado persona){


        Empleado objEmpleado = new Empleado();
        objEmpleado.setNombreEmpleado(persona.getNombreEmpleado());
        objEmpleado.setCorreoEmpleado(persona.getCorreoEmpleado());
        objEmpleado.setRolEmpleado(persona.getRolEmpleado());
        objEmpleado.setEmpresaEmpleado(persona.getEmpresaEmpleado());
        System.out.println("Empleado registrado");

        listaEm.add(objEmpleado);


        return Boolean.TRUE;

    }
}
