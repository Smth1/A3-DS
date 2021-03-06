package entities.dto;

import entities.HotelClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class ClientsDTO {
    private List<HotelClientDTO> clients;
}
