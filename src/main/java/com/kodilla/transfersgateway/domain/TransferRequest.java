package com.kodilla.transfersgateway.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequest {
    private String senderAccount;
    private String recipientAccount;
    private String tittle;
    private BigDecimal amount;
}
