package com.hexagonal.odontologos.odontologos.application.services;

import com.hexagonal.odontologos.odontologos.domain.entities.Odontologo;
import com.hexagonal.odontologos.odontologos.domain.repositories.OdontologoRepository;

public class OdontologoService {
    OdontologoRepository repository;

    public OdontologoService(OdontologoRepository repository){
        this.repository = repository;
    }

    public Odontologo findByMatricula(int matricula){
         return this.repository.fingByMatricula(matricula);
    }

    public int create(Odontologo o){
        return this.repository.create(o);
    }
}
