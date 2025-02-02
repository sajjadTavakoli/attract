package ir.stdev.attact.user.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String id;
    private String username;
    private String lastName;
    private String nationalCode;
    private String birthCertificateNumber;
    private String email;
    private String phone;
    private LocalDate birthDate;

}
