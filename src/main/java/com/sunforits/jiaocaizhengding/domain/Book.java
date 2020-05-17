package com.sunforits.jiaocaizhengding.domain;

import java.io.Serializable;

/**
 * @date 2020/5/11-12:07
 */
public class Book implements Serializable{

    private String name;
    private String chubanshe;
    private Integer money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChubanshe() {
        return chubanshe;
    }

    public void setChubanshe(String chubanshe) {
        this.chubanshe = chubanshe;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", chubanshe='" + chubanshe + '\'' +
                ", money=" + money +
                '}';
    }
}