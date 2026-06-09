package com.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import tools.jackson.databind.json.JsonMapper;

public class JacksonUtils {
    private static final JsonMapper mapper = createMapper();
    private static JsonMapper createMapper() {
        return JsonMapper.builder()
                // 序列化时忽略null属性
                .changeDefaultPropertyInclusion(incl -> incl.withValueInclusion(JsonInclude.Include.NON_NULL))
                .build();
    }
    public static JsonMapper getMapper() {
        return mapper;
    }
}
