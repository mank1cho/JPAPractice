package com.ssgAssignment.ssgAssignment.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class ItemEntity {

    @Id
    @GeneratedValue
    private Long ItemId;

    private String ItemName;

    private String ItemType;

    private Integer ItemPrice;

    private LocalDate ItemDisplayStartDate;

    private LocalDate ItemDisplayEndDate;

    @Builder
    public ItemEntity(Long itemId, String itemName, String itemType, Integer itemPrice, LocalDate itemDisplayStartDate, LocalDate itemDisplayEndDate) {
        ItemId = itemId;
        ItemName = itemName;
        ItemType = itemType;
        ItemPrice = itemPrice;
        ItemDisplayStartDate = itemDisplayStartDate;
        ItemDisplayEndDate = itemDisplayEndDate;
    }
}
