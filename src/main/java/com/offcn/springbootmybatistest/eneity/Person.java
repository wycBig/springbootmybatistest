package com.offcn.springbootmybatistest.eneity;

import java.io.Serializable;

public class Person implements Serializable {
    private Integer pid ;
    private Integer page;
    private String pname;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", page=" + page +
                ", pname='" + pname + '\'' +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Person(Integer pid, Integer page, String pname) {
        this.pid = pid;
        this.page = page;
        this.pname = pname;
    }

    public Person() {
    }
}
