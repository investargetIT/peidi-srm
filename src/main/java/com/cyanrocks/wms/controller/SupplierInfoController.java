package com.cyanrocks.wms.controller;

import com.cyanrocks.wms.constants.SupplierFieldsEnum;
import com.cyanrocks.wms.dao.entity.SupplierEnum;
import com.cyanrocks.wms.dao.entity.SupplierInfo;
import com.cyanrocks.wms.service.SupplierInfoService;
import com.cyanrocks.wms.vo.request.SupplierEnumReq;
import com.cyanrocks.wms.vo.request.SupplierInfoReq;
import com.cyanrocks.wms.vo.response.FieldsDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wjq
 * @Date 2024/8/5 15:48
 */
@RestController
@RequestMapping("/supplier")
@Api(tags = {"供应商接口"})
public class SupplierInfoController {

    @Autowired
    private SupplierInfoService service;

    @GetMapping("/fields")
    @ApiOperation(value = "字段列表")
    public List<FieldsDTO> getConfig() {
        List<FieldsDTO> dtos = new ArrayList<>();
        for (SupplierFieldsEnum fieldsEnum : SupplierFieldsEnum.values()) {
            FieldsDTO dto = new FieldsDTO();
            dto.setLabel(fieldsEnum.getFieldsCn());
            dto.setValue(fieldsEnum.getFieldsEn());
            dtos.add(dto);
        }
        return dtos;
    }

    @GetMapping("/enums")
    @ApiOperation(value = "获取字段枚举")
    public List<SupplierEnum> getEnums(String type) {
        return service.getEnums(type);
    }

    @PostMapping("/enums")
    @ApiOperation(value = "设置字段枚举")
    public void setEnums(@RequestBody List<SupplierEnumReq> reqs) {
        service.setEnums(reqs);
    }

    @GetMapping("/infos")
    @ApiOperation(value = "获取供应商信息列表")
    public List<SupplierInfo> getInfos() {
        return service.getInfos();
    }

    @PostMapping("/infos")
    @ApiOperation(value = "更新供应商信息列表")
    public void setInfos(@RequestBody List<SupplierInfoReq> reqs) {
        service.setInfos(reqs);
    }

}
