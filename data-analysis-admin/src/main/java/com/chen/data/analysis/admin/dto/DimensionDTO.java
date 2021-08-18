package com.chen.data.analysis.admin.dto;

import lombok.Data;

import java.util.List;

@Data
public class DimensionDTO {

    private Integer id;

    private List<String> dimensions;

    private String label;

}
