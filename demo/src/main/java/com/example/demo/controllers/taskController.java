package com.example.demo.controllers;
import com.example.demo.domain.Empleado;
import com.example.demo.domain.Empresa;
import com.example.demo.services.EmpleadosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/Empleado")
public class taskController {
    @Autowired
    Empresa Empresa;
    @Autowired
    EmpleadosService empleadosService;
   /* public String callEmpresa(){
        Empresa objEmpresa = new Empresa();
        objEmpresa.setDireccion("CALLE 14#9-31");
        objEmpresa.setNit(104924811);
        objEmpresa.setNombre("DEVS_MINTIC");
        objEmpresa.setTelefono("3142377011");
        return objEmpresa.getNombre();
    }
    @GetMapping(path = "/Devs/mintic/h",produces = "application/json")
    public String callEmpleado(){
        Empleado objEmpleado = new Empleado();
        objEmpleado.setNombreEmpleado("Edwin Lopez");
        objEmpleado.setCorreoEmpleado("Edwin@gmail.com");

        String h=callEmpresa();
        log.info("HOLA Edwin");
        return Empresa.inscribirEmpleado(objEmpleado,h);
    }

    public String callMovimientoDinero(){
        MovimientoDinero objMovimi= new MovimientoDinero();
        return null;
    }*/

    @GetMapping (path = "/Devs/mintic/listaEmpleados", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Empleado> listaEmpleados (){
        return empleadosService.listar();
    }
    @PostMapping(path = "/Devs/mintic/crearEmpleado", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empleado> crearEmpleado (@RequestBody Empleado empleado){

        boolean salida = empleadosService.addEmpleado (empleado);


        if(salida == true){

            return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);


        }else {

            return new ResponseEntity("Error de Ejecuión ", HttpStatus.INTERNAL_SERVER_ERROR);
        }



    }

}
