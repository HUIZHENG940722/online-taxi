package com.ethan.online.taxi.passenger.service;

import com.ethan.online.taxi.common.dto.ResponseResult;
import com.ethan.online.taxi.passenger.remote.VerificationCodeClient;
import com.ethan.online.taxi.passenger.request.NumberCodeResponse;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhenghui
 * @Description 验证码用户服务
 * @Date 2022/12/11
 */
@Service
public class VerificationCodeService {

    @Autowired
    private VerificationCodeClient verificationCodeClient;

    @Autowired
    private StringRedisTemplate redisTemplate;

    private String verificationCodePrefix = "passenger-verification-code-";

    public ResponseResult generatorCode(String passengerPhone) {
        // 调用验证码服务，获取验证码
        ResponseResult<NumberCodeResponse> responseResult = verificationCodeClient.numberCode(6);
        String value = responseResult.getData().toString();
        // 存入redis
        String key = verificationCodePrefix + passengerPhone;
        redisTemplate.opsForValue().set(key, value, 2, TimeUnit.MINUTES);
        return responseResult;
    }
}
