package com.chen.data.analysis.admin.bo.plan;

import com.chen.data.analysis.common.constant.QueryEngineTypeEnum;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 查询计划建造者工厂类
 */
public class QueryTaskPlanCreatorFactory {

    private static final Map<String, QueryTaskPlanCreator> templateMap = new ConcurrentHashMap<>();

    static {

    }

    public static QueryTaskPlanCreator getQueryTaskPlanCreatorTemplate(QueryEngineTypeEnum engineTypeEnum) {
        return templateMap.getOrDefault(engineTypeEnum.getValue(), null);
    }
}
