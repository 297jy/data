package com.chen.data.analysis.admin.po;

import lombok.Data;

@Data
public class CataloguePO {

    private Integer id;

    private Integer parentId;

    private String name;

    private String describe;
}
