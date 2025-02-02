package ir.stdev.attact.project.api.dto;

import java.math.BigDecimal;

public record CreateProjectResponse(
        String id,
        String name,
        String owner,
        Float profit,
        Integer profitPeriod,
        BigDecimal amountRequired

) {
}
