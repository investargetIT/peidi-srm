package com.cyanrocks.wms.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cyanrocks.wms.dao.entity.SupplierInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierInfoMapper  extends BaseMapper<SupplierInfo> {

    @Delete("select * from supplier_info")
    List<SupplierInfo> selectAll();

    @Delete("delete from supplier_info")
    void deleteAll();
}
