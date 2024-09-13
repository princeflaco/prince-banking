package com.github.princeflaco.princebanking.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoyaltyLevel {
    BRONZE("Bronze"),
    SILVER("Silver"),
    GOLD("Gold"),
    DIAMOND("Diamond");

    private final String value;
}
