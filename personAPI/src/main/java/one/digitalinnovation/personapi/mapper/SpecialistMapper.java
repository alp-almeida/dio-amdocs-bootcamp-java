package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.SpecialistDTO;
import one.digitalinnovation.personapi.entity.Specialist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SpecialistMapper {

    SpecialistMapper INSTANCE = Mappers.getMapper(SpecialistMapper.class);


    Specialist toModel(SpecialistDTO specialistDTO);

    SpecialistDTO toDTO(Specialist specialist);
}
