package com.newcore.electronic.commerce.order.model.response;

import com.newcore.electronic.commerce.base.model.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 订单创建响应模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class OrderCreateResponse extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -7739027723789335660L;
}
