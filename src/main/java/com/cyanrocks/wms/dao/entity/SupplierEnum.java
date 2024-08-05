package com.cyanrocks.wms.dao.entity;

import lombok.Data;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

/**
 * @Author wjq
 * @Date 2024/7/24 15:12
 */
@Entity
@Table(name = "supplier_enum")
@Data
public class SupplierEnum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,  // strategy 设置使用数据库主键自增策略；
            generator = "JDBC")
    private Long id;

    @Column(length = 50, name = "type" )
    @Comment("类型")
    private String type;

    @Column(length = 255, name = "value")
    @Comment("枚举值")
    private String value;

}
