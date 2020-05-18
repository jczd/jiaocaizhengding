package com.sunforits.jiaocaizhengding.domain;

import java.io.Serializable;

/**
 * @date 2020/5/18-12:45
 */
public class TeacherChaXun implements Serializable {

    private String name;
    private String xueyuan;
    private String  book;
    private String  shuliang;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getShuliang() {
        return shuliang;
    }

    public void setShuliang(String shuliang) {
        this.shuliang = shuliang;
    }

    @Override
    public String toString() {
        return "TeacherChaXun{" +
                "name='" + name + '\'' +
                ", xueyuan='" + xueyuan + '\'' +
                ", book='" + book + '\'' +
                ", shuliang='" + shuliang + '\'' +
                '}';
    }
}
