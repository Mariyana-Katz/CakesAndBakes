package com.bakery.CakesAndBakes.entity;

import java.sql.Date;

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

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "order_request")
public class OrderRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Email cannot be blank")
    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @NotBlank(message = "Phone cannot be blank")
    @NotNull
    @Column(name = "phone", nullable = false)
    private String phone;

    @NotNull(message = "Date of the event cannot be null")
    @Column(name = "event_date", nullable = false)
    private Date eventDate;

    @NotBlank(message = "Cake size cannot be blank")
    @NotNull
    @Column(name = "cake_size", nullable = false)
    private String cakeSize;

    @NotBlank(message = "Sponge type cannot be blank")
    @NotNull
    @Column(name = "sponge_type", nullable = false)
    private String spongeType;

    @NotBlank(message = "Cake filling cannot be blank")
    @NotNull
    @Column(name = "cake_filling", nullable = false)
    private String cakeFilling;

    @NotNull(message = "Fondant cover cannot be null")
    @Column(name = "isFondantCovered", nullable = false)
    private Boolean isFondantCovered;

    @NotBlank(message = "Cake details cannot be blank")
    @NotNull
    @Column(name = "cake_details", nullable = false)
    private String cakeDetails;

    @NotBlank(message = "Special instructions cannot be blank")
    @NotNull
    @Column(name = "special_instructions", nullable = false)
    private String specialInstructions;
}