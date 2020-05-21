package com.sunforits.jiaocaizhengding.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/5/11-11:06
 */
@Data
public class YongHu implements Serializable {
    private String name;
    private String password;
    private Integer number;
    private String shenfen;
    private String xueyuan;
}
