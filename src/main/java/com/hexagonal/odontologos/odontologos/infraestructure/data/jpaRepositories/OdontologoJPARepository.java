package com.hexagonal.odontologos.odontologos.infraestructure.data.jpaRepositories;

import com.hexagonal.odontologos.odontologos.domain.entities.Odontologo;
import com.hexagonal.odontologos.odontologos.domain.repositories.OdontologoRepository;
import com.hexagonal.odontologos.odontologos.infraestructure.data.dbo.OdontologoJPAEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoJPARepository extends CrudRepository<OdontologoJPAEntity, Integer> {
}
