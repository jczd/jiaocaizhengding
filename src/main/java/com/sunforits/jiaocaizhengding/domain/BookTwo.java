package com.sunforits.jiaocaizhengding.domain;

import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @date 2020/5/11-16:02
 */
public class BookTwo implements Serializable{
    private String name;
    private int number;
    private  String chubanshe;
    private String tname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChubanshe() {
        return chubanshe;
    }

    public void setChubanshe(String chubanshe) {
        this.chubanshe = chubanshe;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "BookTwo{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", chubanshe='" + chubanshe + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }
}
