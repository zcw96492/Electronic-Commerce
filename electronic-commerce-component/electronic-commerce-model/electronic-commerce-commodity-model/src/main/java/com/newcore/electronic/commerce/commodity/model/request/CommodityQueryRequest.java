package com.newcore.electronic.commerce.commodity.model.request;

import com.newcore.electronic.commerce.base.model.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商品查询请求模型
 * @author zhouchaowei
 */
@Data
public class CommodityQueryRequest extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -1491271910102696084L;
}
