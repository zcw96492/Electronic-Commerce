package com.newcore.electronic.commerce.repository.model.request;

import com.newcore.electronic.commerce.base.model.custom.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 库存信息查询请求模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class RepositoryQueryRequest extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1219785135873203481L;
}
