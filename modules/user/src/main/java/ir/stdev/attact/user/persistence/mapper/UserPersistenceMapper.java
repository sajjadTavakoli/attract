package ir.stdev.attact.user.persistence.mapper;

import ir.stdev.attact.user.api.dto.UserDTO;
import ir.stdev.attact.user.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPersistenceMapper {
    UserEntity toUserEntity(UserDTO userDTO);
    UserDTO toUserDTO(UserEntity userEntity);
}
