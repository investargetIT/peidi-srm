package com.cyanrocks.wms.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cyanrocks.wms.dao.entity.SupplierEnum;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SupplierEnumMapper extends BaseMapper<SupplierEnum> {

    @Delete("delete from supplier_enum")
    void deleteAll();

}
