package ir.stdev.attact.project.service.dto;

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
