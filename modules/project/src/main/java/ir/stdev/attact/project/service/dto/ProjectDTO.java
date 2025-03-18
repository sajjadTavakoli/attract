package ir.stdev.attact.project.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectDTO {

    private String id;
    private String name;
    private String owner;
    private Float profit;
    private Integer profitPeriod;
    private BigDecimal amountRequired;

}
