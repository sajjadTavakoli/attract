package ir.stdev.attact.user.api.facade;

import ir.stdev.attact.user.api.dto.CreateUserRequest;
import ir.stdev.attact.user.api.dto.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserFacade {

    String PATH = "/user";

    @PostMapping(value = "/" , produces = MediaType.APPLICATION_JSON_VALUE)
    UserDTO createUser(@RequestBody CreateUserRequest request);

    @GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    UserDTO getUser(@PathVariable String id);

    @GetMapping(value = "/getById/{nationalCode}", produces = MediaType.APPLICATION_JSON_VALUE)
    UserDTO getUserByNationalCode (@PathVariable String nationalCode);
}
