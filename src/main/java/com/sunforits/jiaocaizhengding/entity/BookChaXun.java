package com.sunforits.jiaocaizhengding.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @date 2020/5/18-12:44
 */
@Data
public class BookChaXun implements Serializable {

    private String name;
    private String chubanshe;
    private String zuozhe;
    private int shuliang;
    private String teacher;

}
