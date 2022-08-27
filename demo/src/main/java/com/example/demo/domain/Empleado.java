package com.example.demo.domain;

import com.example.demo.services.Enum_rol;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Empleado {
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaEmpleado;


    Enum_rol rolEmpleado;

}
