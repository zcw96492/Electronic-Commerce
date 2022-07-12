package com.newcore.electronic.commerce.base.model.custom;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 基本模型
 * @author zhouchaowei
 */
@ApiModel(value = "BaseModel", description = "基本模型")
@Data
public class BaseModel {

    @ApiModelProperty(value = "操作人员所属机构号", name = "operateClerkBranchNo", dataType = "String", required = true)
    private String operateClerkBranchNo;

    @ApiModelProperty(value = "操作人员工号", name = "operateClerkNo", dataType = "String", required = true, position = 1)
    private String operateClerkNo;

    @ApiModelProperty(value = "操作人员姓名", name = "operateClerkName", dataType = "String", required = true, position = 2)
    private String operateClerkName;

    @ApiModelProperty(value = "交易码", name = "transactionCode", dataType = "String", required = true, position = 3)
    private String transactionCode;

    @ApiModelProperty(value = "交易时间戳", name = "transactionTimestamp", dataType = "long", required = true, position = 4)
    private long transactionTimestamp;
}
