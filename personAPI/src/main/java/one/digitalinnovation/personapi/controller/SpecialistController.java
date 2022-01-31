package one.digitalinnovation.personapi.controller;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.SpecialistDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.exception.SpecialistNotFoundException;
import one.digitalinnovation.personapi.service.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/specialist")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SpecialistController {

    private SpecialistService specialistService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createSpecialist(@RequestBody @Valid SpecialistDTO specialistDTO){
        return specialistService.createSpecialist(specialistDTO);
    }


    @GetMapping
    public List<SpecialistDTO> listAll() { return specialistService.listAll();}

    @GetMapping("/{id}")
    public SpecialistDTO findById(@PathVariable Long id) throws SpecialistNotFoundException {
        return specialistService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid SpecialistDTO specialistDTO) throws SpecialistNotFoundException {
        return specialistService.updateById(id, specialistDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws SpecialistNotFoundException {
        specialistService.delete(id);
    }
}