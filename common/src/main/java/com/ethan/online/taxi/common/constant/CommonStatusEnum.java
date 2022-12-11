package com.ethan.online.taxi.common.constant;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhenghui
 * @Description 公共状态枚举
 * @Date 2022/12/11
 */
@Getter
public enum CommonStatusEnum {
    SUCCESS(1, "success"),

    FAIL(0, "fail");

    private int code;

    private String message;

    CommonStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
