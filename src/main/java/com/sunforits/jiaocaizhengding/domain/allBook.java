package com.sunforits.jiaocaizhengding.domain;

/**
 * @date 2020/5/17-17:04
 */
public class allBook {

    private String  book;
    private String  shuliang;
    private String  chubanshe;
    private String  zuozhe;
    private String  teacher;

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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "allBook{" +
                "book='" + book + '\'' +
                ", shuliang='" + shuliang + '\'' +
                ", chubanshe='" + chubanshe + '\'' +
                ", zuozhe='" + zuozhe + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
