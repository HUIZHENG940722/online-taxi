package com.ethan.online.taxi.passenger.request;

import lombok.Data;

/**
 * @Author zhenghui
 * @Description 获取验证码DTO
 * @Date 2022/12/11
 */
@Data
public class VerificationCodeDTO {

    private String passengerPhone;

    private String verificationCode;
}
