package com.ssgAssignment.ssgAssignment.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class PromotionEntity {

    @Id
    @GeneratedValue
    private Long PromotionId;

    private String PromotionName;

    private Integer DiscountAmount;

    private Double DiscountRate;

    private LocalDate PromotionStartDate;

    private LocalDate PromotionEndDate;

    @Builder
    public PromotionEntity(Long promotionId, String promotionName, Integer discountAmount, Double discountRate, LocalDate promotionStartDate, LocalDate promotionEndDate) {
        PromotionId = promotionId;
        PromotionName = promotionName;
        DiscountAmount = discountAmount;
        DiscountRate = discountRate;
        PromotionStartDate = promotionStartDate;
        PromotionEndDate = promotionEndDate;
    }
}
