package com.newcore.electronic.commerce.mail.model.response;

import com.newcore.electronic.commerce.base.model.custom.BaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 邮件发送响应模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class MailSendResponse extends BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1343810631945185365L;
}
