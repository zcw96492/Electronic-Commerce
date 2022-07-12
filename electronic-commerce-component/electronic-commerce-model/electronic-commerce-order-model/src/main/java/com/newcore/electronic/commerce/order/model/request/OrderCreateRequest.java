package com.newcore.electronic.commerce.order.model.request;

import com.newcore.electronic.commerce.base.model.custom.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 订单创建请求模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class OrderCreateRequest extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -704976402323440290L;
}
