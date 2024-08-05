package com.cyanrocks.wms.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

/**
 * @Author wjq
 * @Date 2024/8/5 14:18
 */
@Data
@ApiModel(description = "供应商列表信息")
public class SupplierInfoReq {

    @ApiModelProperty(value = "供应商名称")
    private String supplierName;

    @ApiModelProperty(value = "物资类目")
    private String suppliesCategory;

    @ApiModelProperty(value = "银行账户信息")
    private String bankAccount;

    @ApiModelProperty(value = "合作案例")
    private String cooperationCase;

    @ApiModelProperty(value = "品类")
    private String brand;

    @ApiModelProperty(value = "合作模式")
    private String cooperationMode;

    @ApiModelProperty(value = "销售范围（酒店）")
    private String salesScope;

    @ApiModelProperty(value = "跟进进度")
    private String progress;
}
