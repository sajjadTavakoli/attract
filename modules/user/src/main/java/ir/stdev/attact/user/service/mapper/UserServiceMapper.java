package ir.stdev.attact.user.service.mapper;

import ir.stdev.attact.user.api.dto.CreateUserRequest;
import ir.stdev.attact.user.api.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserServiceMapper {
    UserDTO requestToDTO(CreateUserRequest createUserRequest);
}
