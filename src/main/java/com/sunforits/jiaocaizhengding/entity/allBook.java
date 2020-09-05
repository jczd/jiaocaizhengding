package com.sunforits.jiaocaizhengding.entity;

import lombok.Data;

/**
 * @date 2020/5/17-17:04
 */
@Data
public class allBook {
    private String uid; // 用户id
    private String bid; // 书id
    private Integer shuliang;   // 需要的书籍数量
    private String state;       // 订单状态
    private String start;       // 订单创建时间
    private String end;         // 订单完成时间
}
