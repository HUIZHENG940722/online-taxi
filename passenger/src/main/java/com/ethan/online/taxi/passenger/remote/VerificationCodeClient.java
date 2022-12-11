package com.ethan.online.taxi.passenger.remote;

import com.ethan.online.taxi.common.dto.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author zhenghui
 * @Description 数字验证码服务远程调用客户端
 * @Date 2022/12/11
 */
@FeignClient(value = "verficationcode")
public interface VerificationCodeClient {

    @GetMapping(value = "/numberCode/{size}")
    ResponseResult numberCode(@PathVariable("size") int size);
}
