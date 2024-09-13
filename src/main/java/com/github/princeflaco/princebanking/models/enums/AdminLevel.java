package com.github.princeflaco.princebanking.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AdminLevel {
    MODERATOR("Moderator"),
    OPERATOR("Operator"),
    MANAGER("Manager"),
    OWNER("Owner");

    private final String role;
}
