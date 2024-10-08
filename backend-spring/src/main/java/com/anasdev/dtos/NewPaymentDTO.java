package com.anasdev.dtos;

import com.anasdev.entities.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class NewPaymentDTO {

    private double amount;
    private PaymentType type;
    private LocalDate date;
    private String studentCode;
}
