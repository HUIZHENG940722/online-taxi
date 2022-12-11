package com.ethan.online.taxi.passenger.service;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Author zhenghui
 * @Description 验证码用户服务
 * @Date 2022/12/11
 */
@Service
public class VerificationCodeService {

    public String generatorCode(String passengerPhone) {
        // 调用验证码服务，获取验证码
        System.out.println("调用验证码服务，获取验证码");
        String code = "111111";
        // 存入redis
        JSONObject result = new JSONObject();
        result.put("code", 1);
        result.put("message", "success");
        return result.toString();
    }
}
