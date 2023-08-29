package com.hexagonal.odontologos.odontologos.infraestructure.data.dbo;

import com.hexagonal.odontologos.odontologos.domain.entities.Odontologo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "odontologo")
public class OdontologoJPAEntity {
    @Id
    @Column
    private Integer matricula;
    @Column
    private String nombre;
    @Column
    private String apellido;

    public OdontologoJPAEntity() {
    }

    public OdontologoJPAEntity(Integer matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static Odontologo domainFromEntity(OdontologoJPAEntity entity){
        return new Odontologo(entity.getMatricula(), entity.getNombre(), entity.getApellido());
    }

    public static OdontologoJPAEntity entityFromDomain(Odontologo domain){
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
