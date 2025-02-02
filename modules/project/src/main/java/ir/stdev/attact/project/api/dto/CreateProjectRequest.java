package ir.stdev.attact.project.api.dto;

import java.math.BigDecimal;

public record CreateProjectRequest(
        String name,
        String owner,
        Float profit,
        Integer profitPeriod,
        BigDecimal amountRequired
) {
}
