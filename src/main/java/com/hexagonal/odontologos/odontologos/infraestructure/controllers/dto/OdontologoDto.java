package com.hexagonal.odontologos.odontologos.infraestructure.controllers.dto;

import com.hexagonal.odontologos.odontologos.domain.entities.Odontologo;
import com.hexagonal.odontologos.odontologos.infraestructure.data.dbo.OdontologoJPAEntity;

public class OdontologoDto {

    private Integer matricula;
    private String nombre;
    private String apellido;

    public OdontologoDto(){
    }

    public OdontologoDto(Integer matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public static OdontologoDto dtoFromEntity(OdontologoJPAEntity entity){
        return new OdontologoDto(entity.getMatricula(), entity.getNombre(), entity.getApellido());
    }

    public static OdontologoJPAEntity entityFromDto(OdontologoDto domain){
        return new OdontologoJPAEntity(domain.getMatricula(), domain.getNombre(), domain.getApellido());
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

