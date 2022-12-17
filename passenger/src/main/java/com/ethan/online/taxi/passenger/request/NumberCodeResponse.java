package com.ethan.online.taxi.passenger.request;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author zhenghui
 * @Description 数字验证码响应
 * @Date 2022/12/11
 */
@Data
@Accessors(chain = true)
public class NumberCodeResponse {
    private String numberCode;
}
