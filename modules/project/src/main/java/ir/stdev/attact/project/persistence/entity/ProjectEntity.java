package ir.stdev.attact.project.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectEntity{

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        long id;
        String name;
        Float profit;
        Integer profitPeriod;
        BigDecimal amountRequired;

}
