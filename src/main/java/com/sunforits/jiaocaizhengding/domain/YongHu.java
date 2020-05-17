package com.sunforits.jiaocaizhengding.domain;

import java.io.Serializable;

/**
 * @date 2020/5/11-11:06
 */
public class YongHu implements Serializable{
    private String name;
    private String password;
    private Integer number;
    private String shenfen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getShenfen() {
        return shenfen;
    }

    public void setShenfen(String shenfen) {
        this.shenfen = shenfen;
    }


}
