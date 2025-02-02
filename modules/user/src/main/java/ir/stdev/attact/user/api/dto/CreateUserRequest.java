package ir.stdev.attact.user.api.dto;

import java.time.LocalDate;

public record CreateUserRequest(
        String username,
        String lastName,
        String nationalCode,
        String birthCertificateNumber,
        String email,
        String phone,
        LocalDate birthDate
) {
}
