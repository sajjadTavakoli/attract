package ir.stdev.attact.user.controller;

import ir.stdev.attact.user.api.dto.CreateUserRequest;
import ir.stdev.attact.user.api.dto.UserDTO;
import ir.stdev.attact.user.api.facade.UserFacade;
import ir.stdev.attact.user.service.api.UserServiceApi;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = UserFacade.PATH)
public class UserController implements UserFacade {

    private final UserServiceApi userService;

    @Override
    public UserDTO createUser(CreateUserRequest request) {
        return userService.createUser(request);
    }

    @Override
    public UserDTO getUser(String id) {
        return UserDTO.builder().build();
    }

    @Override
    public UserDTO getUserByNationalCode(String nationalCode) {
        return null;
    }
}
