package com.newcore.electronic.commerce.logistics.model.response;

import com.newcore.electronic.commerce.base.model.custom.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 物流信息查询响应模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class LogisticsInformationQueryResponse extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 9046234564390749967L;
}
