package com.salesForce.service;

import com.salesForce.entity.Empleado;
import com.salesForce.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public Empleado consultarEmpleado(Long id_empleado) {
        return empleadoRepository.findById(id_empleado).get();
    }

    public void crearEmpleado (Empleado empleado ) {
        empleadoRepository.save(empleado);
    }

    // public void editarNitEmpresa (Long id, String nitEmpresa) {
    //        empleadoRepository.findById(id).get().setNitEmpresa(nitEmpresa);
    // }

    public List<Empleado> consultarEmpleados (){
        return new ArrayList<Empleado>(empleadoRepository.findAll());
    }

    public void borrarEmpleado (Long id_empleado) {
        empleadoRepository.deleteById(id_empleado);
    }
}