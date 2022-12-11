package com.ethan.online.taxi.verficationcode.controller;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhenghui
 * @Description 数字验证码用户接口实现
 * @Date 2022/12/11
 */
@RestController
public class NumberCodeController {

    /**
     * 获取数字验证码
     *
     * @param size
     * @return
     */
    @GetMapping(value = "/numberCode/{size}")
    public String numberCode(@PathVariable("size") int size) {
        System.out.println("size:" + size);
        // 生成验证码
        double mathRandom = (Math.random() * 9 + 1) * (Math.pow(10, size - 1));
        System.out.println(mathRandom);
        int resultInt = (int) mathRandom;
        System.out.println(resultInt);
        JSONObject result = new JSONObject();
        result.put("code", 1);
        result.put("message", "success");
        JSONObject data = new JSONObject();
        data.put("numberCode", resultInt);
        result.put("data", data);
        return result.toString();
    }
}
