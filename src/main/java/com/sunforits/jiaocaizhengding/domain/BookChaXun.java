package com.sunforits.jiaocaizhengding.domain;

import java.io.Serializable;

/**
 * @date 2020/5/18-12:44
 */
public class BookChaXun implements Serializable {

    private String name;
    private String  chubanshe;
    private String  zuozhe;
    private int shuliang;
    private String  teacher;

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

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    public int getShuliang() {
        return shuliang;
    }

    public void setShuliang(int shuliang) {
        this.shuliang = shuliang;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "BookChaXun{" +
                "name='" + name + '\'' +
                ", chubanshe='" + chubanshe + '\'' +
                ", zuozhe='" + zuozhe + '\'' +
                ", shuliang=" + shuliang +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
