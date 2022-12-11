package com.ethan.online.taxi.common.dto;

import com.ethan.online.taxi.common.constant.CommonStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author zhenghui
 * @Description 公共响应DTO
 * @Date 2022/12/11
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> {
    private int code;

    private String message;

    private T data;

    public static <T> ResponseResult success(T data) {
        return new ResponseResult<>(CommonStatusEnum.SUCCESS.getCode(), CommonStatusEnum.SUCCESS.getMessage(), data);
    }

    /**
     * 自定义失败：错误码和错误信息
     *
     * @param code
     * @param message
     * @return
     */
    public static ResponseResult fail(int code, String message) {
        return new ResponseResult(code, message, null);
    }

    /**
     * 公共错误返回数据
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult fail(T data) {
        return new ResponseResult(CommonStatusEnum.FAIL.getCode(), CommonStatusEnum.FAIL.getMessage(), data);
    }
}
