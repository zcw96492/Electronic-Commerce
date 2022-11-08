package com.newcore.electronic.commerce.mail.model.request;

import com.newcore.electronic.commerce.base.model.custom.BaseModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 邮件发送请求模型
 * @author zhouchaowei
 * @date 2022-07-05
 */
@Data
public class MailSendRequest extends BaseModel implements Serializable {

    private static final long serialVersionUID = 4998851691334323474L;
}
