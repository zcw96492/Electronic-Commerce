package com.newcore.electronic.commerce.shop.model.request;

import com.newcore.electronic.commerce.base.model.custom.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商户认证请求模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class ShopAuthenticationRequest extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -1155789553201022941L;
}
