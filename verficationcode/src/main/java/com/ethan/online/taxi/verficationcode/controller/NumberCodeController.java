package com.ethan.online.taxi.verficationcode.controller;

import com.ethan.online.taxi.common.dto.ResponseResult;
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
    public ResponseResult numberCode(@PathVariable("size") int size) {
        System.out.println("size:" + size);
        // 生成验证码
        double mathRandom = (Math.random() * 9 + 1) * (Math.pow(10, size - 1));
        System.out.println(mathRandom);
        int resultInt = (int) mathRandom;
        System.out.println(resultInt);
        JSONObject data = new JSONObject();
        data.put("numberCode", resultInt);
        return ResponseResult.success(data);
    }
}
