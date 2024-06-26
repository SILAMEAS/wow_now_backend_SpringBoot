package com.sila.dto.response;

import com.sila.model.Address;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantFavRes implements Serializable {
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
}