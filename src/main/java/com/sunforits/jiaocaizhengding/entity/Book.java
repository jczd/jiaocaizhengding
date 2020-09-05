package com.sunforits.jiaocaizhengding.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/5/11-12:07
 */
@Data
public class Book implements Serializable {

    private String bid;
    private String uid;
    private String name;
    private String chubanshe;
    private Integer money;
    private String zuozhe;

}