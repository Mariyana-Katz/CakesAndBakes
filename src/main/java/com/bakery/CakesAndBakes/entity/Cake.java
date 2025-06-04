package com.bakery.CakesAndBakes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "cake")
public class Cake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Name cannot be Blank")
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank(message = "Flavorame cannot be Blank")
    @NotNull
    @Column(name = "flavor", nullable = false)
    private String flavor;

    @NotBlank(message = "isGlutenFree cannot be Blank")
    @NotNull
    @Column(name = "isGlutenFree", nullable = false)
    private Boolean isGlutenFree;

}
