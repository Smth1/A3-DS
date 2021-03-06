package com.roma.distr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class HotelClientDTO {
    private UUID clientId;
    private String clientName;

    public HotelClientDTO(String clientName) {
        this.clientName = clientName;

    }
}
