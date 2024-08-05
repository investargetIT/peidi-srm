package com.cyanrocks.wms.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cyanrocks.wms.dao.entity.SupplierEnum;
import com.cyanrocks.wms.dao.entity.SupplierInfo;
import com.cyanrocks.wms.dao.mapper.SupplierEnumMapper;
import com.cyanrocks.wms.dao.mapper.SupplierInfoMapper;
import com.cyanrocks.wms.vo.request.SupplierEnumReq;
import com.cyanrocks.wms.vo.request.SupplierInfoReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author wjq
 * @Date 2024/8/5 17:07
 */
@Service
public class SupplierInfoService extends ServiceImpl<SupplierInfoMapper, SupplierInfo> {

    @Autowired
    private SupplierEnumMapper enumMapper;

    public List<SupplierEnum> getEnums(String type){
        return enumMapper.selectList(Wrappers.<SupplierEnum>lambdaQuery().eq(SupplierEnum::getType,type));
    }

    @Transactional
    public void setEnums(List<SupplierEnumReq> reqs){
        enumMapper.deleteAll();
        reqs.forEach(req->{
            SupplierEnum record = new SupplierEnum();
            record.setType(req.getType());
            record.setValue(req.getValue());
            enumMapper.insert(record);
        });
    }

    public List<SupplierInfo> getInfos(){
        return baseMapper.selectAll();
    }

    @Transactional
    public void setInfos(List<SupplierInfoReq> reqs){
        baseMapper.deleteAll();
        reqs.forEach(req->{
            SupplierInfo record = new SupplierInfo();
            record.setSupplierName(req.getSupplierName());
            record.setSuppliesCategory(req.getSuppliesCategory());
            record.setBankAccount(req.getBankAccount());
            record.setCooperationCase(req.getCooperationCase());
            record.setBrand(req.getBrand());
            record.setCooperationMode(req.getCooperationMode());
            record.setSalesScope(req.getSalesScope());
            record.setProgress(req.getProgress());
            baseMapper.insert(record);
        });
    }
}
