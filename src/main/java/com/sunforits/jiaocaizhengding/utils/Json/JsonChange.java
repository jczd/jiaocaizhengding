package com.sunforits.jiaocaizhengding.utils.Json;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/6-13:37 Created by IntelliJ IDEA.
 */
public class JsonChange {
    /*
     * 001.json转换成对象
     * @param:传入对象，json字符串
     * @return:Object
     */
    public static Object jsonToObj(Object obj, String jsonStr) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return obj = mapper.readValue(jsonStr, obj.getClass());
    }

    /*
     * 002.对象转换成json
     * @param:传入对象
     * @return:json字符串
     */
    public static String objToJson(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }
//    public static <T> T string2Obj(String str, Class<T> clazz) {
//        if (StringUtils.isEmpty(str) || clazz == null) {
//            return null;
//        }
//        try {
//            return clazz.equals(String.class) ? (T) str : objectMapper.readValue(str, clazz);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

}