package com.zb.entity;

import java.io.Serializable;

public class HouseType implements Serializable {
    private Integer typeId;
    private String typeName;

    public HouseType() {
    }

    public HouseType(Integer typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
