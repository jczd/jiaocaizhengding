package com.sunforits.jiaocaizhengding.domain;

import java.io.Serializable;

/**
 * @date 2020/5/10-15:53
 */
public class Teacher implements Serializable {
    private String name;
    private String xueyuan;

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

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", xueyuan='" + xueyuan + '\'' +
                '}';
    }
}

