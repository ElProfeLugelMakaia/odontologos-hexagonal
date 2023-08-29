package com.hexagonal.odontologos.odontologos.domain.repositories;

import com.hexagonal.odontologos.odontologos.domain.entities.Odontologo;

public interface OdontologoRepository {
    public Odontologo fingByMatricula(int id);

    public int create(Odontologo o);
}
