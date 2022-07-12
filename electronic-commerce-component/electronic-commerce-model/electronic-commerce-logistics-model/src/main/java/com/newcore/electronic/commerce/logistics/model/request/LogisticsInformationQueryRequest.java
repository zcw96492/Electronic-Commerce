package com.newcore.electronic.commerce.logistics.model.request;

import com.newcore.electronic.commerce.base.model.custom.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 物流信息查询请求模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class LogisticsInformationQueryRequest extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1366512512913855407L;
}
