package com.bakery.CakesAndBakes.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Customer_order")
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @NotNull(message = "Customer id cannot be null")
    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @NotNull(message = "Total cannot be null")
    @Column(name = "total", nullable = false)
    private Double total;

    @NotNull(message = "Order date cannot be null")
    @Column(name = "order_date", nullable = false)
    private Date orderDate;

}