package com.newcore.electronic.commerce.repository.model.response;

import com.newcore.electronic.commerce.base.model.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 库存信息查询响应模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class RepositoryQueryResponse extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 822337581300357822L;
}
