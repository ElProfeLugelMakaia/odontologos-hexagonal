package com.hexagonal.odontologos.odontologos.infraestructure.data.jpaRepositories;

import com.hexagonal.odontologos.odontologos.domain.entities.Odontologo;
import com.hexagonal.odontologos.odontologos.domain.repositories.OdontologoRepository;
import com.hexagonal.odontologos.odontologos.infraestructure.data.dbo.OdontologoJPAEntity;

import java.util.Optional;

public class OdontologoImp implements OdontologoRepository {
    OdontologoJPARepository repository;

    public OdontologoImp(OdontologoJPARepository repository) {
        this.repository = repository;
    }

    @Override
    public Odontologo fingByMatricula(int id) {
        Optional<OdontologoJPAEntity> resultado = this.repository.findById(id);
        if(resultado.isEmpty()) {
            throw new RuntimeException("Odontologo no encontrado");
        }
        return OdontologoJPAEntity.domainFromEntity(resultado.get());
    }

    @Override
    public int create(Odontologo o) {
        OdontologoJPAEntity odontologoJPAEntity = OdontologoJPAEntity.entityFromDomain(o);
        return this.repository.save(odontologoJPAEntity).getMatricula();
    }
}
