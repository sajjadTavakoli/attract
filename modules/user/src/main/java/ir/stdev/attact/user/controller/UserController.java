package ir.stdev.attact.user.controller;

import ir.stdev.attact.user.api.dto.CreateUserRequest;
import ir.stdev.attact.user.api.dto.UserDTO;
import ir.stdev.attact.user.api.facade.UserFacade;
import ir.stdev.attact.user.service.api.UserServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = UserFacade.PATH)
public class UserController implements UserFacade {

    private final UserServiceApi userService;

    public UserController(UserServiceApi userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO createUser(CreateUserRequest request) {
        return userService.createUser(request);
    }

    @Override
    public UserDTO getUser(String id) {
        return null;
    }

    @Override
    public UserDTO getUserByNationalCode(String nationalCode) {
        return null;
    }
}
