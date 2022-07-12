package com.newcore.electronic.commerce.payment.model.request;

import com.newcore.electronic.commerce.base.model.custom.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 支付流水查询请求模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class PaymentFlowQueryRequest extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 3937527050975021030L;
}
