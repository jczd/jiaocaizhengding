package com.sunforits.jiaocaizhengding.utils.map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sunforits.jiaocaizhengding.entity.AllBook;

import java.util.List;
import java.util.Map;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/21-19:00 Created by IntelliJ IDEA.
 */
public class MapChange {
    public static JSONObject mapToJson(Map<String, Object> map) {
        String data = JSON.toJSONString(map);
        return JSON.parseObject(data);
    }

    /**
     * map中取类对象
     *
     * @param map
     * @param clazz
     * @param key
     * @param <T>
     * @return
     */
    public static <T> T mapToObject(Map<String, Object> map, Class<T> clazz, String key) {
        T t = null;
        JSONObject jsonObject = mapToJson(map);
        JSONObject object = jsonObject.getJSONObject(key);
        t = object.toJavaObject(clazz);
        return t;
    }

    /**
     * map中取list
     *
     * @param map
     * @param clazz
     * @param key
     * @return
     */
    public List<AllBook> mapToList(Map<String, Object> map, Class<AllBook> clazz, String key) {
        List<AllBook> t = null;
        JSONObject jsonObject = mapToJson(map);
        JSONArray array = jsonObject.getJSONArray(key);
        t = array.toJavaList(clazz);
        return t;
    }
}