package one.digitalinnovation.personapi.service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.SpecialistDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Specialist;
import one.digitalinnovation.personapi.exception.SpecialistNotFoundException;
import one.digitalinnovation.personapi.mapper.SpecialistMapper;
import one.digitalinnovation.personapi.repository.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SpecialistService {

    private SpecialistRepository specialistRepository;

    private final SpecialistMapper specialistMapper = SpecialistMapper.INSTANCE;

    public MessageResponseDTO createSpecialist(SpecialistDTO specialistDTO) {
        Specialist specialistToSave = specialistMapper.toModel(specialistDTO);

        Specialist savedSpecialist = specialistRepository.save(specialistToSave);
        return createMessageResponse(savedSpecialist.getId(), "Created specialist with ID ");
    }

    public List<SpecialistDTO> listAll() {
        List<Specialist> allPeople = specialistRepository.findAll();
        return allPeople.stream()
                .map(specialistMapper::toDTO)
                .collect(Collectors.toList());
    }

    public SpecialistDTO findById(Long id) throws SpecialistNotFoundException {
        Specialist specialist = verifyIfExists(id);

        return specialistMapper.toDTO(specialist);
    }

    public void delete(Long id) throws SpecialistNotFoundException {
        verifyIfExists(id);
        specialistRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, SpecialistDTO specialistDTO) throws SpecialistNotFoundException {
        verifyIfExists(id);

        Specialist specialistToUpdate = specialistMapper.toModel(specialistDTO);

        Specialist updatedSpecialist = specialistRepository.save(specialistToUpdate);
        return createMessageResponse(updatedSpecialist.getId(), "Updated specialist with ID ");
    }

    private Specialist verifyIfExists(Long id) throws SpecialistNotFoundException {
        return specialistRepository.findById(id)
                .orElseThrow(() -> new SpecialistNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
