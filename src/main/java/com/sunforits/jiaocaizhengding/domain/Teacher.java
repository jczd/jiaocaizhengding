package com.sunforits.jiaocaizhengding.domain;

import java.io.Serializable;

/**
 * @date 2020/5/10-15:53
 */
public class Teacher  implements Serializable{
    private String name;
    private String password;

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

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
