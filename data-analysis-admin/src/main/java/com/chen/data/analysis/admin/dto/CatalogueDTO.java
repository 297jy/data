package com.chen.data.analysis.admin.dto;

import lombok.Data;

@Data
public class CatalogueDTO {

    private Integer id;

    private CatalogueDTO catalogue;

    private String name;

    private String describe;
}
