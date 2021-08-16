package com.chen.data.analysis.admin.dto;

import lombok.Data;

import java.util.List;

@Data
public class ReportFormDTO {

    private Integer id;

    private List<DataSetDTO> dataSets;

    private List<QuotaDTO> quotas;

    private List<GroupDTO> groups;

    private String label;

    private CatalogueDTO catalogue;

}
