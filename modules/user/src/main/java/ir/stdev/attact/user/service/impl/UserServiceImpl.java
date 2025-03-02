package ir.stdev.attact.user.service.impl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import ir.stdev.attact.user.api.dto.CreateUserRequest;
import ir.stdev.attact.user.api.dto.UserDTO;
import ir.stdev.attact.user.persistence.entity.UserEntity;
import ir.stdev.attact.user.persistence.mapper.UserPersistenceMapper;
import ir.stdev.attact.user.persistence.repository.UserRepository;
import ir.stdev.attact.user.service.api.UserServiceApi;
import ir.stdev.attact.user.service.mapper.UserServiceMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserServiceApi {

    private final UserRepository userRepository;
    private final UserPersistenceMapper persistenceMapper;
    private final UserServiceMapper serviceMapper;

    @Override
    @CircuitBreaker(name = "userPersistenceCB" , fallbackMethod = "buildFallback")
    public UserDTO createUser(CreateUserRequest request) {
        UserEntity user = userRepository.save(persistenceMapper.toUserEntity(serviceMapper.requestToDTO(request)));
        return persistenceMapper.toUserDTO(user);
    }

    private UserDTO buildFallback(CreateUserRequest request) {
        return UserDTO.builder().build();
    }
}
