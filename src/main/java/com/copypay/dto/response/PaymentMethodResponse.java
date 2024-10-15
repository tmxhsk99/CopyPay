package com.copypay.dto.response;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentMethodResponse {
    private String isUsed;  //사용여부
    private String authenticationType;  //인증형태
    private String settlementCycle;  //정산주기
    private String settlementCycleEffectiveDate;  //정산주기 적용일자
    private String purchaseMethod;  //매입방법
    private String purchaseDate;  //매입일자
    private String debitcardFeeManagement;  //체크카드 가맹점 수수료 별도 관리 여부
    private String installmentMonths;  //할부개월수 제한
    private String isSmallMidUsed;  //영중소 사용여부
    private String smallMidBalanceSettlementReq;  //영중소 차액정산 요청
    private String differenceSettlementCycle;  //차액정산 주기
    private String majorDomesticUnusableCard;  //국내 사용불가 카드사(메이저)
    private String minorDomesticUnusableCard;  //국내 사용불가 카드사(마이너)
    private String minorForeignUnusableCard;  //해외 사용불가 카드사
}
