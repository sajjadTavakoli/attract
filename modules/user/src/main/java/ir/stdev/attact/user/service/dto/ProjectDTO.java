package ir.stdev.attact.user.service.dto;

import java.math.BigDecimal;

public record ProjectDTO(
        String id,
        String name,
        String owner,
        Float profit,
        Integer profitPeriod,
        BigDecimal amountRequired
) {
}
