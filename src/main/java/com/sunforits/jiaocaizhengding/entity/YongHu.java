package com.sunforits.jiaocaizhengding.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/5/11-11:06
 */
@Data
public class YongHu implements Serializable {
    private String uid;
    private String username;
    private String password;
    private String shenfen;
    private String number;
    private String bumen;
}
