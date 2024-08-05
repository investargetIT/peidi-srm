package com.cyanrocks.wms.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author wjq
 * @Date 2024/7/24 15:12
 */
@Data
@ApiModel(description = "枚举配置")
public class SupplierEnumReq {

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "枚举值")
    private String value;

}
