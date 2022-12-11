package com.ethan.online.taxi.passenger.service;

import com.ethan.online.taxi.common.dto.ResponseResult;
import com.ethan.online.taxi.passenger.remote.VerificationCodeClient;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhenghui
 * @Description 验证码用户服务
 * @Date 2022/12/11
 */
@Service
public class VerificationCodeService {

    @Autowired
    private VerificationCodeClient verificationCodeClient;

    public ResponseResult generatorCode(String passengerPhone) {
        // 调用验证码服务，获取验证码
        ResponseResult responseResult = verificationCodeClient.numberCode(6);
        // 存入redis
        return responseResult;
    }
}
