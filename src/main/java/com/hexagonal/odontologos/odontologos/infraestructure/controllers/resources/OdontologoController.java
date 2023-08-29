package com.hexagonal.odontologos.odontologos.infraestructure.controllers.resources;

import com.hexagonal.odontologos.odontologos.application.services.OdontologoService;
import com.hexagonal.odontologos.odontologos.infraestructure.controllers.dto.OdontologoDto;
import com.hexagonal.odontologos.odontologos.infraestructure.data.dbo.OdontologoJPAEntity;
import com.hexagonal.odontologos.odontologos.infraestructure.data.jpaRepositories.OdontologoImp;
import com.hexagonal.odontologos.odontologos.infraestructure.data.jpaRepositories.OdontologoJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/odontologo")
public class OdontologoController {

    OdontologoService service;
    OdontologoImp repository;

    @Autowired
    public OdontologoController(OdontologoJPARepository jpaRepository) {
        this.repository = new OdontologoImp(jpaRepository);
        this.service = new OdontologoService(this.repository);
    }

    @PostMapping
    public int create(@RequestBody OdontologoDto odontologo) {
        return this.service.create(OdontologoJPAEntity.domainFromEntity(OdontologoDto.entityFromDto(odontologo)));
    }

    @GetMapping("{id}")
    public OdontologoDto findById(@PathVariable int id){
        return OdontologoDto.dtoFromEntity(OdontologoJPAEntity.entityFromDomain(this.service.findByMatricula(id)));
    }
}
