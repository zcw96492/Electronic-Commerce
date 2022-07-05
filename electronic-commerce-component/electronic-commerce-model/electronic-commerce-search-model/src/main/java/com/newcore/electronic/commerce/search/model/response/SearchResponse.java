package com.newcore.electronic.commerce.search.model.response;

import com.newcore.electronic.commerce.base.model.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 搜索响应模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class SearchResponse extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 7216652430865367448L;
}
