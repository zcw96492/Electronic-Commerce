package com.newcore.electronic.commerce.shop.model.response;

import com.newcore.electronic.commerce.base.model.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商户认证响应模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class ShopAuthenticationResponse extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -9052266486887440679L;
}
