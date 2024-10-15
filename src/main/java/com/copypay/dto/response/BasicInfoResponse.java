package com.copypay.dto.response;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasicInfoResponse {
    private ContractResponse contract;
    private SettlementInfoResponse settlementInfo;
    private PaymentMethodResponse paymentMethod;
}
