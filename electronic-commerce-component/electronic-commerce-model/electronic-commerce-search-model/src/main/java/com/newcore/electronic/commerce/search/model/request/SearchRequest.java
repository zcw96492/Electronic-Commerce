package com.newcore.electronic.commerce.search.model.request;

import com.newcore.electronic.commerce.base.model.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 搜索请求模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class SearchRequest extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 3855354214435358984L;
}
