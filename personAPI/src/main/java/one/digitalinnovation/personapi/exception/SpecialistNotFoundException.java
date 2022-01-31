package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SpecialistNotFoundException extends Exception {

    public SpecialistNotFoundException(Long id) {
        super("Specialist not found with ID " + id);
    }
}
