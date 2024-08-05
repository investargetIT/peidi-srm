package com.cyanrocks.wms.dao.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

/**
 * @Author wjq
 * @Date 2024/8/5 14:18
 */
@Entity
@Table(name = "supplier_info")
@Data
public class SupplierInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,  // strategy 设置使用数据库主键自增策略；
            generator = "JDBC")
    private Long id;

    @Column(length = 255, name = "type" )
    @Comment("供应商名称")
    private String supplierName;

    @Column(length = 50, name = "supplies_category" )
    @Comment("物资类目")
    private String suppliesCategory;

    @Column(length = 255, name = "bank_account" )
    @Comment("银行账户信息")
    private String bankAccount;

    @Column(length = 255, name = "cooperation_case" )
    @Comment("合作案例")
    private String cooperationCase;

    @Column(length = 100, name = "brand" )
    @Comment("品类")
    private String brand;

    @Column(length = 50, name = "cooperation_mode" )
    @Comment("合作模式")
    private String cooperationMode;

    @Column(length = 255, name = "sales_scope" )
    @Comment("销售范围（酒店）")
    private String salesScope;

    @Column(length = 10, name = "progress" )
    @Comment("跟进进度")
    private String progress;
}
