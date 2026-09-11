package com.gamebasic.runcard.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;

@Getter
public class RunCardRequest {

    @NotBlank
    private String cardType;

    @NotNull
    @PositiveOrZero
    private Integer acquiredFloor;
}