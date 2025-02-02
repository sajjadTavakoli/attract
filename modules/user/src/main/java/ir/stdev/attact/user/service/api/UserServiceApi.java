package ir.stdev.attact.user.service.api;

import ir.stdev.attact.user.api.dto.CreateUserRequest;
import ir.stdev.attact.user.api.dto.UserDTO;

public interface UserServiceApi {
    UserDTO createUser(CreateUserRequest request);

}
