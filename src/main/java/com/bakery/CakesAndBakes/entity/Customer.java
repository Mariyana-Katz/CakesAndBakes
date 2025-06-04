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
@Table(name = "Customer")
@Getter
@Setter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Name cannot be Blank")
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank(message = "Email cannot be blank")
    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @NotBlank(message = "Phone cannot be blank")
    @NotNull
    @Column(name = "phone", nullable = false)
    private String phone;
}