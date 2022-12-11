package com.ethan.online.taxi.passenger.controller;

import com.ethan.online.taxi.passenger.request.VerificationCodeDTO;
import com.ethan.online.taxi.passenger.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhenghui
 * @Description 验证码用户接口实现
 * @Date 2022/12/11
 */
@RestController
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;

    /**
     * 手机号获取验证码
     *
     * @param verificationCodeDTO
     * @return
     */
    @GetMapping(value = "/verification-code")
    public String verificationCode(@RequestBody VerificationCodeDTO verificationCodeDTO) {

        String passengerPhone = verificationCodeDTO.getPassengerPhone();
        System.out.println("接受到的手机号参数：" + passengerPhone);
        return verificationCodeService.generatorCode(passengerPhone);
    }
}
