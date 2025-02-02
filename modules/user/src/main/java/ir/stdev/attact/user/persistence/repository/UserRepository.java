package ir.stdev.attact.user.persistence.repository;

import ir.stdev.attact.user.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
