package ir.stdev.attact.user.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;
    private String username;
    private String lastName;
    private String nationalCode;
    private String birthCertificateNumber;
    private String email;
    private String phone;
    private LocalDate birthDate;
}
